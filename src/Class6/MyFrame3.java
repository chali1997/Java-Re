package Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame3 extends JFrame implements ActionListener {
    private JButton jb, jb2;
    private JPanel jp;
    private Graphics g;

    public MyFrame3(String title) {
        super(title);
        this.setBounds(100, 80, 400, 300);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        Container c = this.getContentPane();
        c.setLayout(null);

        jb = new JButton("更改");
        jb.setBounds(0, 0, 80, 30);
        c.add(jb);
        jb.addActionListener(this);

        jb2 = new JButton("画图");
        jb2.setBounds(100, 0, 80, 30);
        c.add(jb2);
        jb2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        g = jp.getGraphics();
                        g.setColor(Color.blue);
                        g.drawRect(100, 30, 200, 150);

                        g.setColor(Color.green);
                        g.drawArc(100, 30, 200, 150, 0, 360);
                    }
                }
        );

        jp = new JPanel();
        jp.setBounds(0, 30, 400, 270);
        jp.setBackground(Color.white);
        c.add(jp);
    }

    public void actionPerformed(ActionEvent e) {
        jp.setBackground(Color.red);
    }
}
