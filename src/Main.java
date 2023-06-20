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

        this.setPreferredSize(new Dimension(800, 600));

        this.setLocation(600, 200);

        this.pack();

        this.setVisible(true);
    }
}
