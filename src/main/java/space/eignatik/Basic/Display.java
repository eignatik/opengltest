package space.eignatik.Basic;

import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

import javax.swing.*;
import java.awt.*;

public class Display {
    private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private JFrame frame = new JFrame();

    public void addFigure(String title, GLCanvas canvas, GLEventListener shape, FPSAnimator animator) {
        canvas.addGLEventListener(shape);
        addFigureToFrame(canvas);
        startAnimator(animator);
    }

    public void showFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        setFrameSize(frame);
        frame.setVisible(true);
    }

    private void addFigureToFrame(GLCanvas canvas) {
        frame.getContentPane().add(canvas, BorderLayout.CENTER);
    }

    private void setFrameSize(JFrame frame) {
        frame.setSize(800, 500);
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
    }

    private void startAnimator(FPSAnimator animator) {
        if(animator!=null) {
            animator.start();
        }
    }
}
