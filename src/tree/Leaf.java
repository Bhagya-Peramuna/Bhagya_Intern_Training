package tree;

import common.drawer.Shape;

public class Leaf extends Shape {
    private  int width;
    private int height;
    private int depth;

    private String color;
    private int radius ;

    public Leaf(int row, int col, String color, int depth,int height,int width, int radius) {
        super(row, col);
        this.row = row;
        this.col = col;
        this.color = color;
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public String getColor() {
        return this.color;
    }

    public int getWidth() {
        return this.width;
    }

    public int getRadius() {
        return radius;
    }
}
