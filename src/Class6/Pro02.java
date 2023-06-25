package Class6;

import javax.swing.*;
import java.awt.*;

public class Pro02 {
    /*创建一个窗口，宽400像素高300像素，左顶点坐标为（100，80）
     * 添加一个JButton按钮，宽80像素高30像素，左顶点坐标（0，0），显示文字”更改“
     * 添加一个JPanel面板，宽400像素高270像素，白色背景，左顶点坐标（0，30）*/
    public static void main(String[] args) {
        MyFrame jf = new MyFrame("Example Frame");  //窗口标题

        //获取内容面板，用于管理窗口中的控件
        Container c = jf.getContentPane();
        c.setLayout(null);

        //添加按钮
        JButton jb = new JButton("更改");
        jb.setBounds(0, 0, 80, 30);  //设置坐标和宽高
        c.add(jb);  //添加到面板中

        //添加面板容器
        JPanel jp = new JPanel();
        jp.setBounds(0, 30, 400, 270);  //设置坐标和宽高
        jp.setBackground(Color.white);  //白色背景
        c.add(jp);  //添加到面板中
    }
}
