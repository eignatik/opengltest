package space.eignatik;

import com.jogamp.opengl.GLCapabilities;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Checking.checkThatLibraryWorks();
        new Display().createJFrame("Test");
    }
}
