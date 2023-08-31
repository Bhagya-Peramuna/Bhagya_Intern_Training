package common.drawer;


public class Crescent extends Shape {

    private int radius;
    private String colour;
    private int depth;

    public Crescent(int centerX, int centerY, int radius, String colour,int depth) {
        super(centerX, centerY);
        this.radius = radius;
        this.colour = colour;
        this.depth = depth;
    }



    public int getRadius() {
        return this.radius;
    }
    public String getColour() {
        return colour;
    }


    public int getCol() {
        return super.getCol();
    }

    @Override
    public int getRow() {
        return super.getRow();
    }

}
