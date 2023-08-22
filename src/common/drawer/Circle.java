package common.drawer;



public class Circle extends Shape {
protected int radius;
protected String colour;
    public Circle(int centerX, int centerY, int radius,int depth, String colour) {
        super(centerX, centerY,depth);
        this.radius= radius;
        this.colour = colour;
    }
    public int getRadius() {
        return this.radius;
    }
    public String getColour() {
        return colour;
    }
}
