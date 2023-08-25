package person;

import common.drawer.Circle;
import common.drawer.Crescent;
import common.drawer.Line;
import common.drawer.Rectangle;

import java.util.ArrayList;
import java.util.Collection;

public class PersonBuilder {

    public Rectangle buildBody(int row, int col, int depth, String colour) {
        return new Rectangle(9, 9, row, col, depth, colour);
    }


    public Line buildLimb(int row, int col, int angle, int thickness, int length, int depth, String colour) {
        Line line = new Line(row, col, angle, thickness, length, depth,colour);
        return line;
    }

    public Circle buildCircle(int radius, int centerX, int centerY, String colour,int depth){
        Circle circle = new Circle(centerX,centerY,radius,depth,colour);
        return  circle;
    }

    public Crescent buildHalfCircle(int centerX, int centerY, int radius, String colour,int depth){
        Crescent crescent = new Crescent(centerX, centerY,radius, colour,depth);
        return  crescent;

    }
    public Person buildPerson(String faceColour, String eyeColour, String bodyColour){
        Collection<Circle>circle = new ArrayList<>();
        Collection<Crescent> crescent = new ArrayList<>();
        Person person = new Person(circle,crescent);

//        person.addBody(this.buildBody(10,18,1));
        person.addBody(this.buildBody(15,19,1, bodyColour));

        person.addlimbs(this.buildLimb(14,12,30,1,5,1,bodyColour));
        person.addlimbs(this.buildLimb(28,15,320,1,5,1,bodyColour));
        person.addlimbs(this.buildLimb(19,24,150,1,5,1,bodyColour));
        person.addlimbs(this.buildLimb(30,27,220,1,5,1,bodyColour));
        person.addlimbs(this.buildLimb(23,13,90,1,1,1,bodyColour));


        person.addCircle(this.buildCircle(6,23,7,faceColour,1));
        person.addCircle(this.buildCircle(1,21,5,eyeColour,1));
        person.addCircle(this.buildCircle(1,25,5,eyeColour,1));
        person.addCrescent(this.buildHalfCircle(23,8,1,faceColour,1));

        return person;
    }



    public static Person buildPerson2D(String faceColour, String eyeColour, String bodyColour) {

        PersonBuilder bil = new PersonBuilder();

        Collection<Crescent> cresent = new ArrayList<>();
        Collection<Circle> circle = new ArrayList<>();
        Collection<Line> branch = new ArrayList<>();

        Person per = new Person(circle,cresent,branch);

        per.addlimbs(bil.buildLimb(300,300,90,3,40,1,bodyColour));
        per.addlimbs(bil.buildLimb(300,340,90,30,100,1,bodyColour));
        per.addlimbs(bil.buildLimb(220,300,50,5,100,1,bodyColour));
        per.addlimbs(bil.buildLimb(290,450,120,5,100,1,bodyColour));
        per.addlimbs(bil.buildLimb(310,450,50,5,100,1,bodyColour));
        per.addlimbs(bil.buildLimb(310,380,320,5,100,1,bodyColour));



        per.addCircle(bil.buildCircle(20,200,100,faceColour,1));
        per.addCircle(bil.buildCircle(4,230,130,  eyeColour,1));
        per.addCircle(bil.buildCircle(4,330,130,  eyeColour,1));
        per.addCrescent(bil.buildHalfCircle(300,200,14, bodyColour,2));

        return per;
    }

}
