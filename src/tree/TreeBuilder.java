package tree;
import common.drawer.Circle;
import common.drawer.Line;
import common.drawer.Rectangle;

public class TreeBuilder {


        public TreeBuilder() {
        }
        public Rectangle buildTrunk(int width, int height,int row, int col, int depth, String colour) {
            return new Rectangle(width, height, row, col, depth,colour);//5,9
        }

        public Line buildBranch(int row, int col, int angle, int thickness, int length, int depth, String colour) {
            Line line = new Line(row, col, angle, thickness, length, depth,colour);
            return line;
        }

        public Leaf buildLeaf(int col, int row, int depth, String colour) {
            Leaf leaf1 = new Leaf( row, col,  colour,depth,3,3,0);
            return leaf1;
        }
    public Circle buildCircle(int radius, int centerX, int centerY, String colour, int depth){
        Circle circle = new Circle(centerX,centerY,radius,depth,colour);
        return  circle;
    }

        public Tree buildTree(String trunkColour, String branchColour, String leafCoour1, String leafColour2) {
            Tree tree = new Tree();
            tree.addTrunk(this.buildTrunk(5,9,18, 26, 0,trunkColour));

            tree.addBranch(this.buildBranch(14, 9, 30, 3, 15, 1,branchColour));
            tree.addBranch(this.buildBranch(35, 10, 150, 3, 10, 2, branchColour));
            tree.addBranch(this.buildBranch(35, 10, 30, 3, 4, 3,branchColour));
            tree.addBranch(this.buildBranch(43, 12, 150, 3, 10, 0,branchColour));

            tree.addLeaf(this.buildLeaf(12, 8, 0, leafCoour1));
            tree.addLeaf(this.buildLeaf(16, 6, 1,leafColour2));
            tree.addLeaf(this.buildLeaf(17, 10, 2, leafCoour1));
            tree.addLeaf(this.buildLeaf(22, 11, 3,leafColour2));
            tree.addLeaf(this.buildLeaf(21, 7, 3,leafColour2));
            tree.addLeaf(this.buildLeaf(23, 5, 1,leafColour2));
            tree.addLeaf(this.buildLeaf(17, 14, 0,leafCoour1));
            tree.addLeaf(this.buildLeaf(11, 15, 1,leafColour2));
            tree.addLeaf(this.buildLeaf(18, 18, 2, leafCoour1));
            tree.addLeaf(this.buildLeaf(40, 18, 3, leafCoour1));
            tree.addLeaf(this.buildLeaf(9, 11,0, leafCoour1));
            tree.addLeaf(this.buildLeaf(28, 15, 1,leafColour2));
            tree.addLeaf(this.buildLeaf(36, 16, 2,leafCoour1));
            tree.addLeaf(this.buildLeaf(39, 12, 3,leafColour2));
            tree.addLeaf(this.buildLeaf(33, 16, 0, leafCoour1));
            tree.addLeaf(this.buildLeaf(27, 12, 1,leafColour2));
            tree.addLeaf(this.buildLeaf(33, 12, 2,leafCoour1));
            tree.addLeaf(this.buildLeaf(30, 9, 3,leafColour2));
            tree.addLeaf(this.buildLeaf(35, 7, 0,leafCoour1));
            tree.addLeaf(this.buildLeaf(39, 8, 1,leafColour2));
            tree.addLeaf(this.buildLeaf(39, 6, 2,leafCoour1));
            tree.addLeaf(this.buildLeaf(32, 6, 3,leafColour2));
            tree.addLeaf(this.buildLeaf(27, 6, 0,leafCoour1));
            tree.addLeaf(this.buildLeaf(44, 10, 1,leafColour2));
            tree.addLeaf(this.buildLeaf(47, 12, 2,leafCoour1));
            tree.addLeaf(this.buildLeaf(47, 16, 3,leafColour2));
            tree.addLeaf(this.buildLeaf(49, 8, 0,leafCoour1));
            tree.addLeaf(this.buildLeaf(44, 6, 1,leafColour2));
            tree.addLeaf(this.buildLeaf(44, 15, 2,leafCoour1));
            tree.addLeaf(this.buildLeaf(25, 18, 3,leafColour2));
            tree.addLeaf(this.buildLeaf(20, 16, 3,leafColour2));
            return tree;
        }



    public static Tree buildTree2D(String trunkColour, String branchColour, String leafColour1, String leafColour2) {
        TreeBuilder builder = new TreeBuilder();

        Tree tree = new Tree();

        tree.addTrunk(builder.buildTrunk(50, 100,350, 200, 500, trunkColour));
//,, row = col,                                     col = row
        tree.addBranch(builder.buildBranch(130, 220, 60, 4, 150, 1,branchColour));
        tree.addBranch(builder.buildBranch(320, 230, 120, 4, 150, 1,branchColour));
        tree.addBranch(builder.buildBranch(230, 200, 50, 3, 100, 1,branchColour));
        tree.addBranch(builder.buildBranch(245, 230, 130, 3, 100, 1,branchColour));

        tree.addCircle(builder.buildCircle(4,12, 8,  leafColour1,1));


        tree.addCircle(builder.buildCircle(4,120, 180, leafColour1,1));
        tree.addCircle(builder.buildCircle(4,160, 100, leafColour1,1));



        tree.addCircle(builder.buildCircle(4,100, 100,  leafColour1,2));
        tree.addCircle(builder.buildCircle(5,200, 200, leafColour1, 1));
        tree.addCircle(builder.buildCircle(4,300, 300, leafColour1, 2));
        tree.addCircle(builder.buildCircle(5,300, 200, leafColour1, 3));
        tree.addCircle(builder.buildCircle(5,50, 150, leafColour1, 4));
        tree.addCircle(builder.buildCircle(5,250, 350, leafColour2, 5));
        tree.addCircle(builder.buildCircle(5,100, 300, leafColour2, 6));
        tree.addCircle(builder.buildCircle(5,100, 100, leafColour2, 0));
        tree.addCircle(builder.buildCircle(5,200, 200, leafColour1, 1));
        tree.addCircle(builder.buildCircle(4,250, 200, leafColour2, 2));
        tree.addCircle(builder.buildCircle(4,280, 350, leafColour2, 3));
        tree.addCircle(builder.buildCircle(4,50, 150, leafColour1, 4));
        tree.addCircle(builder.buildCircle(4,250, 350, leafColour2, 5));

        tree.addCircle(builder.buildCircle(4,100, 250, leafColour2, 6));
        tree.addCircle(builder.buildCircle(4,50, 230, leafColour1, 6));
        tree.addCircle(builder.buildCircle(4,300, 100, leafColour1, 6));
        tree.addCircle(builder.buildCircle(4,250, 180, leafColour2, 6));
        tree.addCircle(builder.buildCircle(4,250, 300, leafColour1, 6));
        tree.addCircle(builder.buildCircle(4,150, 330, leafColour2, 6));

        tree.addCircle(builder.buildCircle(4,250, 100, leafColour2, 6));
        tree.addCircle(builder.buildCircle(4,230, 130, leafColour2, 6));
        tree.addCircle(builder.buildCircle(5,230, 300, leafColour2, 6));
        tree.addCircle(builder.buildCircle(5,330, 280, leafColour2, 6));
        tree.addCircle(builder.buildCircle(5,150, 250, leafColour2, 6));
        tree.addCircle(builder.buildCircle(5,200, 270, leafColour2, 6));
        tree.addCircle(builder.buildCircle(5,330, 180, leafColour2, 6));
        tree.addCircle(builder.buildCircle(5,180, 180, leafColour2, 6));

        return tree;
    }



}
