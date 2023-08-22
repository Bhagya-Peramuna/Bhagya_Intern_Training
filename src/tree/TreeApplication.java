package tree;

import common.drawer.Drawer;

public class TreeApplication {

        public static void main(String[] args) {
           TreeBuilder treeBuilder = new TreeBuilder();

           Tree tree1 = treeBuilder.buildTree(0);
           Drawer drawer1 = new Drawer(80,80);
            drawer1.draw(tree1.getTrunks());
            drawer1.draw(tree1.getBranches());
            drawer1.draw(tree1.getLeaves());
            drawer1.displayframe();



            Tree tree2 = treeBuilder.buildTree(1);
            Drawer drawer2 = new Drawer(80,80);
            drawer2.draw(tree2.getTrunks());
            drawer2.draw(tree2.getBranches());
            drawer2.draw(tree2.getLeaves());
            drawer2.displayframe();

        }
    }


