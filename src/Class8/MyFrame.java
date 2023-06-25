package Class8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private JLabel label;  //标签
    private JButton button;  //按钮
    private Container container;  //内容面板

    public MyFrame() {
        this.setBounds(0, 0, 400, 300);
        container = this.getContentPane();  //内容面板
        container.setLayout(null);  //关闭布局

        label = new JLabel("Hello World!");
        label.setBounds(80, 30, 100, 30);
        container.add(label);

        button = new JButton("开始计数");
        button.setBounds(80, 70, 100, 30);
        container.add(button);

        //也可以在添加监听对象时，直接创建一个ActionListener接口的子类对象作参数，同时重写方法
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //单击button时，会执行下面的代码
                new Thread(new Runnable() {
                    @Override
                    public void run() {  //将耗时操作放在线程中
                        for (int i = 0; i <= 10; i++) {
                            label.setText(i + "");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }).start();
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
