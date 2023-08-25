package graphic2d.tree;
//

import common.drawer.Shape;
import tree.Tree;
import tree.TreeBuilder;
import tree.TreeColourTheme;

import javax.swing.*;
import java.util.Collection;

public class  TreeApplication  {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TreeColourTheme theme1 = new TreeColourTheme();

            Tree tree = TreeBuilder.buildTree2D(theme1.trunckBrownTheme1, theme1.branchBrownTheme1, theme1.leafLightGreenTheme1, theme1.leafDarkGreenTheme1);

            Collection<Shape> branches = tree.getBranches();
            Collection<Shape> leaves = tree.getCircles();
            Collection<Shape> trunks = tree.getTrunks();
//            Collection<Shape> circles = tree.getCircles();

            TreeDrawer2D drawerGUI = new TreeDrawer2D(branches, leaves, trunks);

            JFrame frame = new JFrame("Tree Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.add(drawerGUI);
            frame.setVisible(true);
        });
    }

}
