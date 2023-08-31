package graphic2d;
//

import common.drawer.Circle;
import common.drawer.DrawerGUI;
import common.drawer.Shape;
import tree.Tree;
import tree.TreeBuilder;
import tree.TreeColourTheme;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class  TreeApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
                    TreeColourTheme theme1 = new TreeColourTheme();

                    Collection<Shape> allShapes = new ArrayList<>();


                    Tree tree = TreeBuilder.buildTree2D(theme1.trunckBrownTheme1, theme1.branchBrownTheme1, theme1.leafLightGreenTheme1, theme1.leafDarkGreenTheme1);

                    allShapes.addAll(tree.getBranches());
                    allShapes.addAll(tree.getCircles());
                    allShapes.addAll(tree.getTrunks());



                    DrawerGUI drawerGUI = new DrawerGUI(depth());

                    JFrame frame = new JFrame("Tree Drawer");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(500, 500);
                    frame.add(drawerGUI);
                    frame.setVisible(true);
                }
        );
    }

    public static Collection<Shape> depth() {
        TreeColourTheme theme1 = new TreeColourTheme();

        Tree tree = TreeBuilder.buildTree2D(theme1.trunckBrownTheme1, theme1.branchBrownTheme1, theme1.leafLightGreenTheme1, theme1.leafDarkGreenTheme1);

        Collection<Shape> allShapes = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                allShapes.addAll(tree.getBranches());
                allShapes.addAll(tree.getTrunks());
            } else {
                Collection<Shape> shapes = tree.getCircles();
                for (Shape shape : shapes) {
                    if (shape instanceof Circle) {

                        Circle circle = (Circle) shape;
                        int depth = circle.getDepth();
                        if (depth == 1) {
                            System.out.println(circle.getDepth());
                            allShapes.add(circle);
                        }
                    }
                }
            }





            Collection<Shape> shapes = tree.getCircles();
            for (Shape shape : shapes) {
                if (shape instanceof Circle) {
                    Circle circle = (Circle) shape;
                    int depth = circle.getDepth();
                    if (depth == 3) {
                        System.out.println(circle.getDepth());
                        allShapes.add(circle);
                    }
                }
            }



        }
        return allShapes;
    }

}

