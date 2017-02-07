package space.eignatik;

import com.jogamp.opengl.GLCapabilities;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Path to Jogl library: " + System.getProperty("java.library.path") + "\n");
        try {
            System.out.println("Hello World! (The native libraries are installed.)");
            GLCapabilities caps = new GLCapabilities(null);
            System.out.println("Hello JOGL! (The jar appears to be available.)");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
