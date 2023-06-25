package Class8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame2 extends JFrame {
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
    public MyFrame2() {
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
        panel.setFocusable(true);  //将面板设为焦点，否则面板不响应键盘事件
        container.add(panel);
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
//有字符被输入，包括按下、松开
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        drawShape(Color.BLACK);
                        y -= LEN;
                        drawShape();
                        break;
                    case KeyEvent.VK_DOWN:
                        drawShape(Color.BLACK);
                        y += LEN;
                        drawShape();
                        break;
                    case KeyEvent.VK_LEFT:
                        drawShape(Color.BLACK);
                        x -= LEN;
                        drawShape();
                        break;
                    case KeyEvent.VK_RIGHT:
                        drawShape(Color.BLACK);
                        x += LEN;
                        drawShape();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
//键松开
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        graphics = panel.getGraphics();  //获取JPanel的画图对象
        x = STARTX;    //初始化方块坐标
        y = STARTY;
        line = 3;

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    drawShape(Color.BLACK);
                    y += LEN;
                    drawShape();
                }
            }
        }).start();
    }

    //自定义方法，根据x、y、line画出方块，采用对应颜色
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
}
