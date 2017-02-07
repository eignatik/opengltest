package space.eignatik;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

public class CustomCanvas extends GLCanvas implements GLEventListener {
    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
//        GL gl = glAutoDrawable.getGL();
//        glAutoDrawable.setGL(new DebugGL(gl));
//
//        // Global settings.
//        gl.glEnable(GL.GL_DEPTH_TEST);
//        gl.glDepthFunc(GL.GL_LEQUAL);
//        gl.glShadeModel(GL.GL_SMOOTH);
//        gl.glHint(GL.GL_PERSPECTIVE_CORRECTION_HINT, GL.GL_NICEST);
//        gl.glClearColor(0f, 0f, 0f, 1f);
//
//        // Start animator (which should be a field).
//        animator = new FPSAnimator(this, 60);
//        animator.start();
    }

    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }
}
