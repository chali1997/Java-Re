package Class3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//继承JFrame后，Pro06的对象就是一个窗口
public class Pro06 extends JFrame {
    private JButton button;  //按钮
    private Container container;  //窗口的内容面板，是一个容器，上面可以放其他控件或者画图
    private Graphics graphics;  //画图对象

    public Pro06() {
        this.setSize(400, 300);  //设置窗口大小
        this.setLocation(200, 200);  //设置窗口左顶点坐标
        container = this.getContentPane();  //获取窗口的内容面板
        container.setLayout(null);  //关闭布局，不同布局的排列方式不一样
        container.setBackground(Color.black);  //面板背景为黑色
        button = new JButton("画图");  //创建按钮
        button.setBounds(0, 0, 80, 30);  //设置按钮起点和大小
        //按钮的点击事件，单击按钮时会执行actionPerformed()方法中的代码
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //设置画图颜色
                graphics.setColor(Color.red);
                int[][] shapes = new int[][]{
                        {1, 1, 2, 1, 1, 2, 2, 2},  //“田”字形
                        {0, 1, 1, 1, 2, 1, 3, 1},  //“一”字形
                        {1, 0, 0, 1, 1, 1, 2, 1},  //“土”字形
                        {0, 0, 0, 1, 1, 1, 2, 1},  //“反7”形
                        {2, 0, 0, 1, 1, 1, 2, 1},  //“正7”形
                        {0, 0, 1, 0, 1, 1, 2, 1},  //“正2”形
                        {1, 0, 2, 0, 0, 1, 1, 1}  //“反2”形
                };
                //记录7种形状对应的颜色
                Color[] colors = new Color[]{
                        Color.CYAN, Color.RED, Color.LIGHT_GRAY, Color.MAGENTA, Color.YELLOW, Color.GREEN, Color.BLUE
                };
                //定义4x4方块图形的起点坐标
                int x = 150, y = 50;
                //定义每个小方块的长度
                int length = 25;
                //画“土”字形，它的行号是2
                int lineNumber = 2;  //改变lineNumber的值，就能画出不同的形状
                graphics.setColor(colors[lineNumber]);  //取出“土”字形对应的颜色
                //访问二维数组shapes的行号为2的那一行，并每次取该行中的2个数字
                for (int i = 0; i < shapes[lineNumber].length; i = i + 2) {
                    int x2 = x + shapes[lineNumber][i] * length;  //算出某个小方块的左顶点的“实际”坐标
                    int y2 = y + shapes[lineNumber][i + 1] * length;
                    //画小方块，长宽24会让每个小方块之间有1个像素的距离
                    graphics.fill3DRect(x2, y2, 24, 24, true);
                }
            }
        });
        container.add(button);  //把按钮添加到内容面板中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //窗口默认关闭操作
        this.setVisible(true);  //设置窗口可见
        graphics = container.getGraphics();  //获取内容面板的画图对象，要在setVisible()之后才能调用
    }

    public static void main(String[] args) {
        Pro06 russian = new Pro06();  //创建对象得到窗口
    }
}
