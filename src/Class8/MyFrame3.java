package Class8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame3 extends JFrame {
    //把形状、颜色、起始坐标、小方块长度都定义成常量
    public final int[][] SHAPES = new int[][]{
            {1, 1, 2, 1, 1, 2, 2, 2},  //田
            {0, 1, 1, 1, 2, 1, 3, 1},  //一
            {1, 0, 0, 1, 1, 1, 2, 1},  //土
            {0, 0, 0, 1, 1, 1, 2, 1},  //反7
            {2, 0, 0, 1, 1, 1, 2, 1},  //正7
            {0, 0, 1, 0, 1, 1, 2, 1},  //正2
            {1, 0, 2, 0, 0, 1, 1, 1}  //反2
    };
    //记录7种形状的颜色
    public final Color[] COLORS = new Color[]{
            Color.CYAN, Color.RED, Color.LIGHT_GRAY, Color.MAGENTA, Color.YELLOW, Color.GREEN, Color.BLUE
    };
    //定义4x4方块的起点坐标
    public final int STARTX = 150, STARTY = 50;
    //定义每个小方块的长度
    public final int LEN = 25;
    private JPanel panel;  //面板
    private JButton button;  //按钮
    private Container container;  //内容面板
    private Graphics graphics; //JPanel的画图对象
    private int x, y;  //方块目前坐标
    private int line;  //目前画的是哪一行的形状

    //构造函数
    public MyFrame3() {
        this.setBounds(200, 0, 300, 500);
        container = this.getContentPane();  //内容面板

        panel = new JPanel() {  //在创建JPanel的同时，重写paint()方法
            public void paint(Graphics arg0) {
                super.paint(arg0);  //调用父类的paint()方法，设背景黑色
                arg0.setColor(COLORS[line]);  //设置画图颜色
                for (int i = 0; i < SHAPES[line].length; i += 2) {
                    int x2 = x + SHAPES[line][i] * LEN;
                    int y2 = y + SHAPES[line][i + 1] * LEN;
                    arg0.fill3DRect(x2, y2, LEN - 1, LEN - 1, true);
                }
            }
        };
        panel.setBackground(Color.BLACK);
        panel.setFocusable(true);
        container.add(panel);

        //给监听添加键盘监听，创建接口KeyListener的子类对象作参数，并重写方法
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent arg0) {
                //有字符被输入，包括按下、松开
            }


            @Override
            public void keyPressed(KeyEvent arg0) {
                switch (arg0.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        left();
                        break;
                    case KeyEvent.VK_RIGHT:
                        right();
                        break;
                    case KeyEvent.VK_UP:
                        up();
                        break;
                    case KeyEvent.VK_DOWN:
                        down();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent arg0) {
//键松开
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        graphics = panel.getGraphics();  //获取JPanel的画图对象
        x = STARTX;  //初始化方块坐标
        y = STARTY;
        line = (int) (Math.random() * SHAPES.length);  //随机产生0~6的整数

        //初始化自定义线程对象，并开启线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //将方块下落的代码down()像事件一样添加到事件队列中，等着按顺序执行
                    //这里相当于模拟单击一下按钮，就执行一次down()方法
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            down();
                        }
                    });
                }
            }
        }).start();
    }

    //自定义方法，根据x、y、line画出方块
    public void drawShape() {
        graphics.setColor(COLORS[line]);
        for (int i = 0; i < SHAPES[line].length; i += 2) {
            int x2 = x + SHAPES[line][i] * LEN;
            int y2 = y + SHAPES[line][i + 1] * LEN;
            graphics.fill3DRect(x2, y2, LEN - 1, LEN - 1, true);
        }
    }

    public void drawShape(Color color) {
        graphics.setColor(color);
        for (int i = 0; i < SHAPES[line].length; i += 2) {
            int x2 = x + SHAPES[line][i] * LEN;
            int y2 = y + SHAPES[line][i + 1] * LEN;
            graphics.fill3DRect(x2, y2, LEN - 1, LEN - 1, true);
        }
    }

    public void left() {
        drawShape(Color.BLACK);
        x -= LEN;
        drawShape();
    }

    public void right() {
        drawShape(Color.BLACK);
        x += LEN;
        drawShape();
    }

    public void up() {
        drawShape(Color.BLACK);
        line = (line + 1) % SHAPES.length;
        drawShape();
    }

    public void down() {
        drawShape(Color.BLACK);
        y += LEN;
        drawShape();
    }
}
