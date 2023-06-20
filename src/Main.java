import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main
{
    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new JFrameWindow();
    }
}

class JFrameWindow extends JFrame
{
    private static final long serialVersionUID = 1L;

    public JFrameWindow()
    {
        super("traffic light picture");

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                System.exit(0);
            }
            @Override
            public void windowOpened(WindowEvent e) {}
            @Override
            public void windowClosed(WindowEvent e) {}
            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e) {}
            @Override
            public void windowDeactivated(WindowEvent e) {}
        });

        this.add(new TrafficLight());

        this.setPreferredSize(new Dimension(800, 600));

        this.setLocation(600, 200);

        this.pack();

        this.setVisible(true);
    }
}

class TrafficLight extends Canvas
{
    private static int xo = 350;
    private static int yo = 100;
    @Override
    public void paint(Graphics g) {
        int x, y;

        super.paint(g);

        this.setBackground(Color.LIGHT_GRAY);


        x = xo; y = yo - 25;
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x, y + 10, 80, 80);
        g.setColor(Color.BLACK);
        g.fillRoundRect(x + 12, y + 9, 56, 10, 8, 8);

        g.setColor(Color.BLACK);

        g.fillRoundRect(xo + 0, yo + 0, 80, 260, 20, 20);
        g.fillRoundRect(xo + 0 + 20, yo + 0 + 265, 40, 45, 20, 20);

        x = xo - 55; y = yo + 20;
        g.fillRoundRect(x, y, 50, 10, 10, 10);
        g.fillRoundRect(x + 40, y + 0, 10, 50, 10, 10);
        g.fillPolygon(new int[]{x + 4, x + 40, x + 40}, new int[]{y + 10, y + 10, y + 46}, 3);

        x = xo - 55; y = yo + 100;
        g.fillRoundRect(x, y, 50, 10, 10, 10);
        g.fillRoundRect(x + 40, y + 0, 10, 50, 10, 10);
        g.fillPolygon(new int[]{x + 4, x + 40, x + 40}, new int[]{y + 10, y + 10, y + 46}, 3);

        x = xo - 55; y = yo + 180;
        g.fillRoundRect(x, y, 50, 10, 10, 10);
        g.fillRoundRect(x + 40, y + 0, 10, 50, 10, 10);
        g.fillPolygon(new int[]{x + 4, x + 40, x + 40}, new int[]{y + 10, y + 10, y + 46}, 3);

        x = xo + 85; y = yo + 20;
        g.fillRoundRect(x, y, 50, 10, 10, 10);
        g.fillRoundRect(x, y, 10, 50, 10, 10);
        g.fillPolygon(new int[]{x + 10, x + 10, x + 47}, new int[]{y + 47, y + 10, y + 10}, 3);

        x = xo + 85; y = yo + 100;
        g.fillRoundRect(x, y, 50, 10, 10, 10);
        g.fillRoundRect(x, y, 10, 50, 10, 10);
        g.fillPolygon(new int[]{x + 10, x + 10, x + 47}, new int[]{y + 47, y + 10, y + 10}, 3);

        x = xo + 85; y = yo + 180;
        g.fillRoundRect(x, y, 50, 10, 10, 10);
        g.fillRoundRect(x, y, 10, 50, 10, 10);
        g.fillPolygon(new int[]{x + 10, x + 10, x + 47}, new int[]{y + 47, y + 10, y + 10}, 3);

        x = xo + 15; y = yo + 20;
        g.setColor(Color.WHITE);
        g.fillOval(x - 3, y - 10, 56, 56);
        g.setColor(Color.BLACK);
        g.fillOval(x - 4, y - 5, 58, 58);
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);

        x = xo + 15; y = yo + 100;
        g.setColor(Color.WHITE);
        g.fillOval(x - 3, y - 10, 56, 56);
        g.setColor(Color.BLACK);
        g.fillOval(x - 4, y - 5, 58, 58);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 50, 50);

        x = xo + 15; y = yo + 180;
        g.setColor(Color.WHITE);
        g.fillOval(x - 3, y - 10, 56, 56);
        g.setColor(Color.BLACK);
        g.fillOval(x - 4, y - 5, 58, 58);
        g.setColor(Color.GREEN);
        g.fillOval(x, y, 50, 50);

    }
}
