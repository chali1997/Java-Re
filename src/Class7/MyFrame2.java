package Class7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame2 extends JFrame {
    public final int[][] SHAPES = new int[][]{
            {1, 1, 2, 1, 1, 2, 2, 2},
            {0, 1, 1, 1, 2, 1, 3, 1},
            {1, 0, 0, 1, 1, 1, 2, 1},
            {0, 0, 0, 1, 1, 1, 2, 1},
            {2, 0, 0, 1, 1, 1, 2, 1},
            {0, 0, 1, 0, 1, 1, 2, 1},
            {1, 0, 2, 0, 0, 1, 1, 1}
    };
    public final Color[] COLORS = new Color[]{
            Color.CYAN, Color.RED, Color.LIGHT_GRAY, Color.MAGENTA, Color.YELLOW, Color.GREEN, Color.BLUE
    };
    public final int STARTX = 150, STARTY = 50;
    public final int LEN = 25;
    private JPanel contentPane;
    private Container container;
    private Graphics graphics;
    private int x, y;
    private int line;

    public MyFrame2() {
        this.setBounds(200, 0, 300, 500);
        container = this.getContentPane();

        contentPane = new JPanel() {
            public void paint(Graphics arg0) {
                super.paint(arg0);

                arg0.setColor(COLORS[line]);
                for (int i = 0; i < SHAPES[line].length; i = i + 2) {
                    int x2 = x + SHAPES[line][i] * LEN;
                    int y2 = y + SHAPES[line][i + 1] * LEN;
                    arg0.fill3DRect(x2, y2, LEN - 1, LEN - 1, true);
                }
            }
        };
        contentPane.setBackground(Color.BLACK);
        contentPane.setFocusable(true);
        container.add(contentPane);
        contentPane.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent arg0) {
                switch (arg0.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        drawShape(Color.BLACK);
                        x = x - LEN;
                        drawShape();
                        break;
                    case KeyEvent.VK_RIGHT:
                        drawShape(Color.BLACK);
                        x = x + LEN;
                        drawShape();
                        break;
                    case KeyEvent.VK_UP:
                        drawShape(Color.BLACK);
                        y = y - LEN;
                        drawShape();
                        break;
                    case KeyEvent.VK_DOWN:
                        drawShape(Color.BLACK);
                        y = y + LEN;
                        drawShape();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        graphics = contentPane.getGraphics();
        x = STARTX;
        y = STARTY;
        line = 3;
    }

    public void drawShape() {
        graphics.setColor(COLORS[line]);
        for (int i = 0; i < SHAPES[line].length; i = i + 2) {
            int x2 = x + SHAPES[line][i] * LEN;
            int y2 = y + SHAPES[line][i + 1] * LEN;
            graphics.fill3DRect(x2, y2, LEN - 1, LEN - 1, true);
        }
    }

    public void drawShape(Color color) {
        graphics.setColor(color);
        for (int i = 0; i < SHAPES[line].length; i = i + 2) {
            int x2 = x + SHAPES[line][i] * LEN;
            int y2 = y + SHAPES[line][i + 1] * LEN;
            graphics.fill3DRect(x2, y2, LEN - 1, LEN - 1, true);
        }
    }
}
