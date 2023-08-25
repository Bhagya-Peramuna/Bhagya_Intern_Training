package graphic2d.face;

import common.drawer.Shape;
import face.FaceBuilder;
import face.FaceColourTheme;
import face.SmileyFace;

import javax.swing.*;
import java.util.Collection;

public class FaceApplication {

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {

                FaceBuilder builder = new FaceBuilder();
                FaceColourTheme theme1 = new FaceColourTheme();
                FaceColourTheme theme2 = new FaceColourTheme();
                SmileyFace face = builder.buildFace2D(theme1.faceYellowTheme1, theme1.eyeLightBlueTheme1, theme1.mouthRedTheme1);

                Collection<Shape> circles = face.getCircle();
                Collection<Shape> crescent = face.getCrescent();
//                Collection<Shape> branch = face.getCrescent();
//                Collection<Shape> trunk = face.getCrescent();

                FaceDrawer2D drawerGUI = new FaceDrawer2D(circles, crescent);
//                Drawer2D drawerGUI = new Drawer2D(circles, crescent,branch,trunk);

                JFrame frame = new JFrame("Face Drawer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 800);
                frame.add(drawerGUI);
                frame.setVisible(true);
            });
        }
}
