package space.eignatik;

import com.jogamp.opengl.util.FPSAnimator;
import space.eignatik.Basic.Display;
import space.eignatik.Basic.Shapes.Cube;
import space.eignatik.Basic.Shapes.CustomCanvas;
import space.eignatik.Basic.Shapes.PolygonCanvas;

public class Main {
    private static Display display = new Display();

    public static void main(String[] args) {
        Checking.checkThatLibraryWorks();
//        Cube cube = new Cube();
//        PolygonCanvas pol = new PolygonCanvas();
//        display.addFigure("Test", pol, new PolygonCanvas(), null);
//        display.addFigure("Test", cube, new Cube(), new FPSAnimator(cube, 300, true));
        CustomCanvas canvas = new CustomCanvas();
        display.addFigure("Test", canvas, new CustomCanvas(), new FPSAnimator(canvas, 300, true));
        display.showFrame();
    }
}
