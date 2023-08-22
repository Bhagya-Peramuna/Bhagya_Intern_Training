package common.drawer;


public class Crescent extends Shape {

    private int radius;
    private String colour;

    private int innerRadius = 2;
    public Crescent(int centerX, int centerY, int radius, String colour,int depth) {
        super(centerX, centerY,depth);
        this.radius = radius;
        this.colour = colour;
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
