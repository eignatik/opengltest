package space.eignatik;

import javax.swing.*;
import java.awt.*;

public class Display {
    public void createJFrame(String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //TODO: remove new Label
        frame.getContentPane().add(new Label("Example!"), BorderLayout.CENTER);
        frame.pack();
        frame.setSize(800, 500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }
}
