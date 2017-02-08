package space.eignatik;

import com.jogamp.opengl.util.FPSAnimator;
import space.eignatik.Basic.Display;
import space.eignatik.Basic.Shapes.Cube;

public class Main {
    private static Display display = new Display();

    public static void main(String[] args) {
        Checking.checkThatLibraryWorks();
        Cube cube = new Cube();
        display.showFigure("Test", cube, new Cube(), new FPSAnimator(cube, 300, true));
    }
}
