package space.eignatik;

import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;
import java.awt.*;

public class Display {
    private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public void createFrame(String title, GLCanvas canvas) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas, BorderLayout.CENTER);
        frame.pack();
        setFrameSize(frame);
        frame.setVisible(true);
    }

    private void setFrameSize(JFrame frame) {
        frame.setSize(800, 500);
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
    }
}
