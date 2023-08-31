package graphic2d;

import common.drawer.DrawerGUI;
import common.drawer.Shape;
import face.FaceBuilder;
import face.SmileyFace;
import person.PersonColourTheme;
import tree.Tree;
import tree.TreeBuilder;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class PersonApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            PersonColourTheme theme1 = new PersonColourTheme();

            SmileyFace face = FaceBuilder.buildPersonFace2D(theme1.faceYellowTheme1, theme1.eyeDarkGreenTheme1, theme1.bodyBrownTheme1);
            Tree tree = TreeBuilder.buildPersonBody2D(theme1.faceYellowTheme1);

            Collection<Shape> allShapes = new ArrayList<>();

            allShapes.addAll(face.getCircle());
            allShapes.addAll(face.getCrescent());
            allShapes.addAll(tree.getTrunks());
            allShapes.addAll(tree.getBranches());


            DrawerGUI drawerGUI = new DrawerGUI(allShapes);

            JFrame frame = new JFrame("Person Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            frame.add(drawerGUI);
            frame.setVisible(true);
        });
    }
}
