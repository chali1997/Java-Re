package Class6;

import javax.swing.*;

public class MyFrame extends JFrame {
    //构造函数，一般在构造函数中设置好窗口属性，创建对象时就会生成一个窗口
    public MyFrame() {
        super("Example Frame");  //窗口标题
        this.setBounds(100, 80, 400, 300);  //坐标，宽高

        //设置默认关闭操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);  //设置窗口可见
    }

    //构造函数还可以重载
    public MyFrame(String title) {
        super(title);
        this.setBounds(100, 80, 400, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
