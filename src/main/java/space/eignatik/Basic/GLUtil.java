package space.eignatik.Basic;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;

public class GLUtil {
    public static GLCapabilities getCapabilities() {
        return new GLCapabilities(GLProfile.get(GLProfile.GL2));
    }
}
