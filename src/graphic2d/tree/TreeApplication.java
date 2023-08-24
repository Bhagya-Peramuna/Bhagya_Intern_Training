package graphic2d.tree;
//

import common.drawer.Shape;
import tree.Tree;

import javax.swing.*;
import java.util.Collection;

public class  TreeApplication  {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            Tree tree = TreeBuilder.buildTree();

            Collection<Shape> branches = tree.getBranches();
            Collection<Shape> leaves = tree.getLeaves();
            Collection<Shape> trunks = tree.getTrunks();

            DrawerGUI drawerGUI = new DrawerGUI(branches, leaves, trunks);

            JFrame frame = new JFrame("Tree Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.add(drawerGUI);
            frame.setVisible(true);
        });
    }

}
