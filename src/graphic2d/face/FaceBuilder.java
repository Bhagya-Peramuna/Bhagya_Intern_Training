package graphic2d.face;

import common.drawer.Circle;
import common.drawer.Crescent;
import face.FaceColourTheme;
import face.SmileyFace;

import java.util.ArrayList;
import java.util.Collection;

public class FaceBuilder {

        FaceColourTheme theme = new FaceColourTheme();

        String themeColor1 = theme.faceYellowTheme1;
       String themeColor2 = theme.faceDarkBlueTheme2;

    public Crescent buildHalfCrescent(int centerX, int centerY, int radius, String colour, int depth) {
        Crescent crescent = new Crescent(centerX, centerY, radius, colour, depth);
        return crescent;
    }
    public Circle buildCircle(int radius, int centerX, int centerY, String colour, int depth){
        Circle circle = new Circle(centerX,centerY,radius,depth,colour);
        return  circle;
    }

        public SmileyFace buildFace() {
            FaceBuilder builder = new FaceBuilder();
            Collection<Circle> circles = new ArrayList<>();

            Collection<Crescent> crescents = new ArrayList<>();
            SmileyFace face = new SmileyFace( circles, crescents);

            face.addCircle(builder.buildCircle(25, 100, 150, themeColor1, 1));
            face.addCircle(builder.buildCircle(4, 150, 200, themeColor1, 1));
            face.addCircle(builder.buildCircle(4, 250, 200, themeColor1, 1));
            face.addCrescent(builder.buildHalfCrescent(230, 300, 50, themeColor2, 150));

            return face;
        }
    }


