package Class7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button, button2;
    private Container container;

    public MyFrame() {
        this.setBounds(0, 0, 400, 300);
        container = this.getContentPane();
        container.setLayout(null);

        label = new JLabel("Hello World");
        label.setBounds(0, 0, 100, 50);
        container.add(label);

        button = new JButton("更改文字");
        button.setBounds(0, 70, 100, 30);
        container.add(button);
        button.addActionListener(this);

        button2 = new JButton("更改颜色");
        button2.setBounds(0, 120, 100, 30);
        container.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                label.setForeground(Color.BLUE);
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent arg0) {
        label.setText("世界，你好");
    }
}
