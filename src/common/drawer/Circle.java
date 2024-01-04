package common.drawer;

public class Circle extends Shape  {
    protected int radius;
    protected  int depth;
    protected String colour;
    public Circle(int centerX, int centerY, int radius,int depth, String colour) {
        super(centerX, centerY);
        this.radius= radius;
        this.colour = colour;
        this.depth = depth;
    }
    public int getRadius() {
        return this.radius;
    }
    public String getColour() {
        return colour;
    }

    public  int getDepth() {
        return depth;
    }
}
