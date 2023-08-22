package face;

import common.drawer.Circle;
import common.drawer.Crescent;

public class FaceBuilder {
    public Circle buildCircle(int radius, int centerX, int centerY, String colour, int depth){
        Circle circle = new Circle(centerX,centerY,radius,depth,colour);
        return  circle;
    }

        public Crescent buildHalfCircle(int centerX, int centerY, int radius, String colour, int depth){
        Crescent crescent = new Crescent(centerX, centerY,radius, colour,depth);
        return  crescent;
    }

    public SmileyFace buildSmileyFace(String faceColor, String eyeColor, String mouthColor){
        SmileyFace smileyFace= new SmileyFace();

        smileyFace.addCircle(this.buildCircle(10,25,15,faceColor,1));

        smileyFace.addCircle(this.buildCircle(1,20,11,eyeColor,1));
        smileyFace.addCircle(this.buildCircle(1,30,11,eyeColor,1));

        smileyFace.addCrescent(this.buildHalfCircle(25,20,2,mouthColor,1));

        return  smileyFace;
    }
}
