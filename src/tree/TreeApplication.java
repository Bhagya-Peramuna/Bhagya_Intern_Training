package tree;

import common.drawer.Drawer;

public class TreeApplication {

        public static void main(String[] args) {
           TreeBuilder treeBuilder = new TreeBuilder();
            Tree tree = treeBuilder.buildTree();

           Drawer drawer = new Drawer(80,80);

            drawer.draw(tree.getTrunks());
            drawer.draw(tree.getBranches());
            drawer.draw(tree.getLeaves());
            drawer.displayframe();

        }
    }


