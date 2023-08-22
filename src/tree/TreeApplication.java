package tree;

import common.drawer.Drawer;

public class TreeApplication {

        public static void main(String[] args) {
           TreeBuilder treeBuilder = new TreeBuilder();

           TreeColourTheme theme1 = new TreeColourTheme();

           Tree tree1 = treeBuilder.buildTree(theme1.trunckBrownTheme1, theme1.branchBrownTheme1, theme1.leafLightGreenTheme1, theme1.leafDarkGreenTheme1);
           Drawer drawer1 = new Drawer(80,80);
            drawer1.draw(tree1.getTrunks());
            drawer1.draw(tree1.getBranches());
            drawer1.draw(tree1.getLeaves());
            drawer1.displayframe();


            TreeColourTheme theme2 = new TreeColourTheme();
            Tree tree2 = treeBuilder.buildTree(theme2.trunckPurpleTheme2, theme2.branchPurpleTheme2, theme2.leafLightBlueTheme2, theme2.leafDarkBlueTheme2);
            Drawer drawer2 = new Drawer(80,80);
            drawer2.draw(tree2.getTrunks());
            drawer2.draw(tree2.getBranches());
            drawer2.draw(tree2.getLeaves());
            drawer2.displayframe();

        }
    }


