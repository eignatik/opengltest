package space.eignatik;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import space.eignatik.shapes.Line;

import javax.swing.*;

public class ShapeDrawer {

    private ShapeDrawer() {

    }

    public static void showCanvas() {
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);

        GLCanvas glcanvas = new GLCanvas(capabilities);
        Line line3d = new Line();
        glcanvas.addGLEventListener( line3d );
        glcanvas.setSize(400, 400);

        JFrame frame = new JFrame ("Basic Frame");
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }
}
