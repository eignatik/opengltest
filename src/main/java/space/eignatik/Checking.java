package space.eignatik;

import com.jogamp.opengl.GLCapabilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Checking {
    public static final Logger logger = LogManager.getLogger(Checking.class.getName());

    public static void checkThatLibraryWorks() {
        try {
            logger.info("The native libraries are installed.");
            GLCapabilities caps = new GLCapabilities(null);
            logger.info("The jar appears to be available.");
        } catch(Exception e) {
            logger.error(e.getMessage());
        }
    }
}
