//import common.drawer.Line;
//import common.drawer.Rectangle;
//import tree.TreeColour;
//import tree.Leaf;
//import tree.Tree;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//
//    public static class TreeBuilder {
//
//        public TreeBuilder() {
//            }
//            public Rectangle buildTrunk(int row, int col, int depth) {
//                return new Rectangle(9, 9, row, col, depth);
//            }
//
//            public Line buildBranch(int row, int col, int angle, int thickness, int length, int depth, String colour) {
//                Line line = new Line(row, col, angle, thickness, length, depth,colour);
//                return line;
//            }
//
//            public Leaf buildLeaf(int col, int row, int depth, String colour) {
//                Leaf leaf1 = new Leaf( row, col,  colour,depth,3,3);
//                return leaf1;
//            }
//
//        public Tree buildTree() {
//                Tree tree = new Tree();
//                tree.addTrunk(this.buildTrunk(18, 26, 0));
//
//                tree.addBranch(this.buildBranch(27, 17, 210, 3, 7, 1, TreeColour.getBranchColour()));
//                tree.addBranch(this.buildBranch(35, 10, 150, 3, 10, 2,TreeColour.getBranchColour()));
//                tree.addBranch(this.buildBranch(35, 10, 30, 3, 6, 3,TreeColour.getBranchColour()));
//                tree.addBranch(this.buildBranch(48, 9, 150, 3, 15, 0,TreeColour.getBranchColour()));
//
//                tree.addLeaf(this.buildLeaf(12, 8, 0, TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(16, 6, 1,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(17, 10, 2, TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(22, 11, 3,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(21, 7, 3,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(23, 5, 1,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(17, 14, 0, TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(11, 15, 1,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(18, 18, 2, TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(40, 18, 3, TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(9, 11,0, TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(28, 15, 1,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(36, 16, 2, TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(39, 12, 3,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(33, 16, 0, TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(27, 12, 1,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(33, 12, 2,TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(30, 9, 3,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(35, 7, 0,TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(39, 8, 1,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(39, 6, 2,TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(32, 6, 3,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(27, 6, 0,TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(44, 10, 1,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(47, 12, 2,TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(47, 16, 3,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(49, 8, 0,TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(44, 6, 1,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(44, 15, 2,TreeColour.getLeavesColourOne()));
//                tree.addLeaf(this.buildLeaf(25, 18, 3,TreeColour.getLeavesColourTwo()));
//                tree.addLeaf(this.buildLeaf(20, 16, 3,TreeColour.getLeavesColourTwo()));
//                return tree;
//            }
//        }
//}