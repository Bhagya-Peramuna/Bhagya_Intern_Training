package graphic2d.tree;
//
import common.drawer.Line;
import common.drawer.Rectangle;
import tree.Leaf;
import tree.Tree;
import tree.TreeColourTheme;
public class TreeBuilder {

    TreeColourTheme theme = new TreeColourTheme();

    String themeColor1 = theme.trunckBrownTheme1;
    String themeColor2 = theme.leafDarkGreenTheme1;

    public Rectangle buildTrunk(int row, int col, int width, int height,int depth) {
        Rectangle rectangle = new Rectangle(width, height, row, col,depth, themeColor1);
        return rectangle;
    }

    public Line buildBranch(int row, int col, int angle, int thickness, int length, int depth){
        Line line = new Line(row, col, angle, thickness, length, depth,themeColor1);
        return line;
    }

    public Leaf buildLeaf(int col, int row, int depth, int height , int width ,int radius){
        Leaf leaf1 = new Leaf(row,col,themeColor2 ,depth,  height, width,radius);
        return leaf1;
    }

    public static Tree buildTree() {
        TreeBuilder builder = new TreeBuilder();

        Tree tree = new Tree();

         tree.addTrunk(builder.buildTrunk(350, 200, 50, 100, 1));
//,, row = col,                                     col = row
        tree.addBranch(builder.buildBranch(130, 220, 60, 4, 150, 1));
        tree.addBranch(builder.buildBranch(320, 230, 120, 4, 150, 1));
        tree.addBranch(builder.buildBranch(230, 200, 50, 3, 100, 1));
        tree.addBranch(builder.buildBranch(245, 230, 130, 3, 100, 1));



        tree.addLeaf(builder.buildLeaf(120, 180, 0,40,40,4));
        tree.addLeaf(builder.buildLeaf(160, 100, 1,50,50,5));


        tree.addLeaf(builder.buildLeaf(100, 100, 0, 40, 40, 4));
        tree.addLeaf(builder.buildLeaf(200, 200, 1, 50, 50, 5));
        tree.addLeaf(builder.buildLeaf(300, 300, 2, 60, 60, 4));
        tree.addLeaf(builder.buildLeaf(300, 200, 3, 70, 70, 5));
        tree.addLeaf(builder.buildLeaf(50, 150, 4, 30, 30, 4));
        tree.addLeaf(builder.buildLeaf(250, 350, 5, 40, 40, 4));
        tree.addLeaf(builder.buildLeaf(100, 300, 6, 50, 50, 4));
        tree.addLeaf(builder.buildLeaf(100, 100, 0, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(200, 200, 1, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(250, 200, 2, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(280, 350, 3, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(50, 150, 4, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(250, 350, 5, 4, 4, 4));

        tree.addLeaf(builder.buildLeaf(100, 250, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(50, 230, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(300, 100, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(250, 180, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(250, 300, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(150, 330, 6, 4, 4, 4));

        tree.addLeaf(builder.buildLeaf(250, 100, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(230, 130, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(230, 300, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(330, 280, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(150, 250, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(200, 270, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(330, 180, 6, 4, 4, 4));
        tree.addLeaf(builder.buildLeaf(180, 180, 6, 4, 4, 4));

        return tree;
    }
}
