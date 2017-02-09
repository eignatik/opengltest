package space.eignatik.Basic.Shapes.drawable;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

public class Sphere implements Drawable {
    private GL2 gl;
    private GLU glu;
    private float SHINE_ALL_DIRECTIONS = 1;
    private float[] lightPos = {-30, 0, 0, SHINE_ALL_DIRECTIONS};
    private float[] lightColorAmbient = {0.2f, 0.2f, 0.2f, 1f};
    private float[] lightColorSpecular = {0.8f, 0.8f, 0.8f, 1f};
    private float rquad = 0.0f;

    private float radius;
    private int slices;
    private int stacks;

    private float rotateX = 0.0f;
    private float rotateY = 0.0f;
    private float rotateZ = 0.0f;


    public Sphere(GLU glu, GLAutoDrawable drawable, float radius, int slices, int stacks) {
        this.glu = glu;
        gl = drawable.getGL().getGL2();
        this.radius = radius;
        this.slices = slices;
        this.stacks = stacks;
    }

    @Override
    public void draw() {
        setRotate(); //todo: think about rotating. it doesn't work at this case
        setLightParams();
        setMaterialProperties();
        drawSphere();
    }

    private void setLightParams() {
        gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_POSITION, lightPos, 0);
        gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_AMBIENT, lightColorAmbient, 0);
        gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_SPECULAR, lightColorSpecular, 0);

        // Enable lighting in GL.
        gl.glEnable(GL2.GL_LIGHT1);
        gl.glEnable(GL2.GL_LIGHTING);
    }

    private void setMaterialProperties() {
        float[] rgba = {0.3f, 0.5f, 1f};
        gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_AMBIENT, rgba, 0);
        gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_SPECULAR, rgba, 0);
        gl.glMaterialf(GL2.GL_FRONT, GL2.GL_SHININESS, 0.5f);
    }

    private void drawSphere() {
        GLUquadric earth = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(earth, GLU.GLU_FILL);
        glu.gluQuadricNormals(earth, GLU.GLU_FLAT);
        glu.gluQuadricOrientation(earth, GLU.GLU_OUTSIDE);
        glu.gluSphere(earth, radius, slices, stacks);
        glu.gluDeleteQuadric(earth);
    }

    private void setRotate() {
        gl.glRotatef(rquad, rotateX, rotateY, rotateZ);
    }

    @Override
    public void setRotatingParams(float rotateX, float rotateY, float rotateZ) {
        this.rotateX = rotateX;
        this.rotateY = rotateY;
        this.rotateZ = rotateZ;
    }
}
