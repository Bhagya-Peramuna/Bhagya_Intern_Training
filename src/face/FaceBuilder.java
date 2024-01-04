package face;

import common.drawer.Circle;
import common.drawer.Crescent;
import common.drawer.Shape;
import java.util.ArrayList;
import java.util.Collection;

public class FaceBuilder {
    public static Circle buildCircle(int radius, int centerX, int centerY, String colour, int depth){
        Circle circle = new Circle(centerX,centerY,radius,depth,colour);
        return  circle;
    }

    public static Crescent buildHalfCircle(int centerX, int centerY, int radius, String colour, int depth){
        Crescent crescent = new Crescent(centerX, centerY,radius, colour,depth);
        return  crescent;
    }

    public  SmileyFace buildSmileyFace(String faceColor, String eyeColor, String mouthColor){
        Collection<Shape>circle = new ArrayList<>();
        Collection<Shape> crescent = new ArrayList<>();
        SmileyFace smileyFace= new SmileyFace(circle,crescent);

        smileyFace.addCircle(this.buildCircle(10,25,15,faceColor,1));

        smileyFace.addCircle(this.buildCircle(1,20,11,eyeColor,1));
        smileyFace.addCircle(this.buildCircle(1,30,11,eyeColor,1));

        smileyFace.addCrescent(this.buildHalfCircle(25,20,2,mouthColor,1));

        return  smileyFace;
    }

    public static SmileyFace buildFace2D(String faceColor, String eyeColor, String mouthColor) {

        Collection<Shape> circles = new ArrayList<>();
        Collection<Shape> crescents = new ArrayList<>();
        SmileyFace face = new SmileyFace( circles, crescents);

        face.addCircle(FaceBuilder.buildCircle(25, 100, 150, faceColor, 1));
        face.addCircle(FaceBuilder.buildCircle(4, 150, 200, eyeColor, 1));
        face.addCircle(FaceBuilder.buildCircle(4, 250, 200, eyeColor, 1));
        face.addCrescent(FaceBuilder.buildHalfCircle(230, 300, 50, mouthColor, 1));

        return face;
    }

    public static SmileyFace buildPersonFace2D(String faceColour, String eyeColour, String bodyColour) {

        Collection<Shape> circles = new ArrayList<>();
        Collection<Shape> crescents = new ArrayList<>();
        SmileyFace sf = new SmileyFace(circles,crescents);

        sf.addCircle(FaceBuilder.buildCircle(25, 200, 100, faceColour, 1));

        sf.addCircle(FaceBuilder.buildCircle(4, 250, 150, eyeColour, 1));
        sf.addCircle(FaceBuilder.buildCircle(4, 350, 150, eyeColour, 1));

        sf.addCrescent(FaceBuilder.buildHalfCircle(330,250,14, bodyColour,1));

        return sf;
    }

}
