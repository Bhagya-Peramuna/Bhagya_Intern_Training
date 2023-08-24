package graphic2d.person;

import common.drawer.Circle;
import common.drawer.Crescent;
import common.drawer.Line;
import person.Person;
import tree.TreeColourTheme;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class PersonBuilder {
    TreeColourTheme theme = new TreeColourTheme();

    String themeColor1 = theme.trunckBrownTheme1;

    public Line buildLimb(int row, int col, int angle, int thickness, int length, int depth){
        Line line = new Line(row, col, angle, thickness, length, depth,themeColor1);
        return line;
    }

    public Circle buildCircle(int radius, int centerX, int centerY, String colour, int depth){
        Circle circle = new Circle(centerX,centerY,radius,depth,colour);
        return  circle;
    }
    public Crescent buildHalfCrescent(int centerX, int centerY, int radius, String colour, int depth) {
        Crescent crescent = new Crescent(centerX, centerY, radius, colour, depth);
        return crescent;
    }
    public static Person buildPerson() {

        PersonBuilder bil = new PersonBuilder();

        Collection<Crescent> cresent = new ArrayList<>();
        Collection<Circle> circle = new ArrayList<>();
        Collection<Line> branch = new ArrayList<>();

        Person per = new Person(circle,cresent,branch);

        per.addlimbs(bil.buildLimb(300,300,90,3,40,1));
        per.addlimbs(bil.buildLimb(300,340,90,30,100,1));
        per.addlimbs(bil.buildLimb(220,300,50,5,100,1));
        per.addlimbs(bil.buildLimb(290,450,120,5,100,1));
        per.addlimbs(bil.buildLimb(310,450,50,5,100,1));
        per.addlimbs(bil.buildLimb(310,380,320,5,100,1));



        per.addCircle(bil.buildCircle(20,200,100, String.valueOf(Color.gray),1));
        per.addCircle(bil.buildCircle(4,230,130, String.valueOf(Color.yellow),1));
        per.addCircle(bil.buildCircle(4,330,130, String.valueOf(Color.yellow),1));
        per.addCrescent(bil.buildHalfCrescent(300,200,14, String.valueOf(Color.magenta),2));

        return per;
    }

    }
