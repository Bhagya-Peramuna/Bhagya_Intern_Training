package graphic2d.face;

import common.drawer.Shape;
import face.SmileyFace;

import javax.swing.*;
import java.util.Collection;

public class FaceApplication {

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {

                FaceBuilder builder = new FaceBuilder();
                SmileyFace face = builder.buildFace();

                Collection<Shape> circles = face.getCircle();
                Collection<Shape> crescent = face.getCrescent();

                FaceDrawer drawerGUI = new FaceDrawer(circles, crescent);

                JFrame frame = new JFrame("Tree Drawer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 800);
                frame.add(drawerGUI);
                frame.setVisible(true);
            });
        }
}
