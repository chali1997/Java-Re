package Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame implements ActionListener {
    private JButton jb;
    private JPanel jp;

    public MyFrame2(String title) {
        super(title);
        this.setBounds(100, 80, 400, 300);
        this.setLayout(null);

        Container c = this.getContentPane();
        c.setLayout(null);

        jb = new JButton("更改");
        jb.setBounds(0, 0, 80, 30);
        c.add(jb);
        jb.addActionListener(this);

        jp = new JPanel();
        jp.setBounds(0, 30, 400, 270);
        jp.setBackground(Color.white);
        c.add(jp);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        jp.setBackground(Color.red);
    }
}
