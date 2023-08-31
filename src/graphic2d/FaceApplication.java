package graphic2d;

import common.drawer.DrawerGUI;
import common.drawer.Shape;
import face.FaceBuilder;
import face.FaceColourTheme;
import face.SmileyFace;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class FaceApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            FaceBuilder builder = new FaceBuilder();
            FaceColourTheme theme1 = new FaceColourTheme();
            FaceColourTheme theme2 = new FaceColourTheme();
            SmileyFace face = builder.buildFace2D(theme1.faceYellowTheme1, theme1.eyeLightBlueTheme1, theme1.mouthRedTheme1);

            Collection<Shape> allShapes = new ArrayList<>();

            allShapes.addAll(face.getCircle());
            allShapes.addAll(face.getCrescent());

            DrawerGUI drawerGUI = new DrawerGUI(allShapes);

            JFrame frame = new JFrame("Face Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            frame.add(drawerGUI);
            frame.setVisible(true);
        });
    }
}
