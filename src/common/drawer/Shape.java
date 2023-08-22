package common.drawer;

public class Shape {
    protected int col;
    protected int row;

    protected static int depth;

    public Shape(int col, int row,int depth) {
        this.col = col;
        this.row = row;
       this.depth=depth;

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
    public static int getDepth() {
        return depth;
    }
}
