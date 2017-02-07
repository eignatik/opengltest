package space.eignatik.shapes;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;

public class Line implements GLEventListener {
    private GLU glu = new GLU();

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glTranslatef(0f, 0f, -2.5f);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(-0.75f, 0f, 0);
        gl.glVertex3f(0f, -0.75f, 0);
        gl.glEnd();
    }

    @Override
    public void dispose(GLAutoDrawable arg0) {

    }

    @Override
    public void init(GLAutoDrawable arg0) {

    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

        GL2 gl = drawable.getGL().getGL2();

        if (height <= 0)
            height = 1;

        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();

        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
}