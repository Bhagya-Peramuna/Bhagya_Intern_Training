package face;

import common.drawer.Circle;
import common.drawer.Crescent;

import java.util.ArrayList;
import java.util.Collection;

public class FaceBuilder {
    public Circle buildCircle(int radius, int centerX, int centerY, String colour, int depth){
        Circle circle = new Circle(centerX,centerY,radius,depth,colour);
        return  circle;
    }

        public Crescent buildHalfCircle(int centerX, int centerY, int radius, String colour, int depth){
        Crescent crescent = new Crescent(centerX, centerY,radius, colour,depth);
        return  crescent;
    }

    public  SmileyFace buildSmileyFace(String faceColor, String eyeColor, String mouthColor){
         Collection<Circle>circle = new ArrayList<>();
         Collection<Crescent> crescent = new ArrayList<>();
        SmileyFace smileyFace= new SmileyFace(circle,crescent);

        smileyFace.addCircle(this.buildCircle(10,25,15,faceColor,1));

        smileyFace.addCircle(this.buildCircle(1,20,11,eyeColor,1));
        smileyFace.addCircle(this.buildCircle(1,30,11,eyeColor,1));

        smileyFace.addCrescent(this.buildHalfCircle(25,20,2,mouthColor,1));

        return  smileyFace;
    }

    public SmileyFace buildFace2D(String faceColor, String eyeColor, String mouthColor) {
//        face.FaceBuilder builder = new face.FaceBuilder();
        Collection<Circle> circles = new ArrayList<>();

        Collection<Crescent> crescents = new ArrayList<>();
        SmileyFace face = new SmileyFace( circles, crescents);

        face.addCircle(this.buildCircle(25, 100, 150, faceColor, 1));
        face.addCircle(this.buildCircle(4, 150, 200, eyeColor, 1));
        face.addCircle(this.buildCircle(4, 250, 200, eyeColor, 1));
        face.addCrescent(this.buildHalfCircle(230, 300, 50, mouthColor, 150));

        return face;
    }
}
