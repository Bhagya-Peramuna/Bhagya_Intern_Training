package tree;
import common.drawer.Line;
import common.drawer.Rectangle;

public class TreeBuilder {


        public TreeBuilder() {
        }
        public Rectangle buildTrunk(int row, int col, int depth) {
            return new Rectangle(9, 9, row, col, depth);
        }

        public Line buildBranch(int row, int col, int angle, int thickness, int length, int depth,String colour) {
            Line line = new Line(row, col, angle, thickness, length, depth,colour);
            return line;
        }

        public Leaf buildLeaf(int col, int row, int depth, String colour) {
            Leaf leaf1 = new Leaf( row, col,  colour,depth,3,3);
            return leaf1;
        }

        public Tree buildTree() {
            Tree tree = new Tree();
            tree.addTrunk(this.buildTrunk(18, 26, 0));

            tree.addBranch(this.buildBranch(14, 9, 30, 3, 15, 1,TreeColour.getBranchColour()));
            tree.addBranch(this.buildBranch(35, 10, 150, 3, 10, 2, TreeColour.getBranchColour()));
            tree.addBranch(this.buildBranch(35, 10, 30, 3, 4, 3,TreeColour.getBranchColour()));
            tree.addBranch(this.buildBranch(43, 12, 150, 3, 10, 0,TreeColour.getBranchColour()));

            tree.addLeaf(this.buildLeaf(12, 8, 0, TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(16, 6, 1,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(17, 10, 2, TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(22, 11, 3,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(21, 7, 3,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(23, 5, 1,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(17, 14, 0, TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(11, 15, 1,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(18, 18, 2, TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(40, 18, 3, TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(9, 11,0, TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(28, 15, 1,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(36, 16, 2, TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(39, 12, 3,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(33, 16, 0, TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(27, 12, 1,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(33, 12, 2,TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(30, 9, 3,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(35, 7, 0,TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(39, 8, 1,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(39, 6, 2,TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(32, 6, 3,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(27, 6, 0,TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(44, 10, 1,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(47, 12, 2,TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(47, 16, 3,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(49, 8, 0,TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(44, 6, 1,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(44, 15, 2,TreeColour.getLeavesColourOne()));
            tree.addLeaf(this.buildLeaf(25, 18, 3,TreeColour.getLeavesColourTwo()));
            tree.addLeaf(this.buildLeaf(20, 16, 3,TreeColour.getLeavesColourTwo()));
            return tree;
        }



}
