package Class6;

import javax.swing.*;

public class Pro01 {
    //创建一个窗口，宽400像素高300像素，左顶点坐标为（0，0）
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(0, 0, 400, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
