package person;

import common.drawer.Circle;
import common.drawer.Crescent;
import common.drawer.Line;
import common.drawer.Rectangle;

public class PersonBuilder {

    public Rectangle buildBody(int row, int col, int depth, String colour) {
        return new Rectangle(9, 9, row, col, depth, colour);
    }


    public Line buildLimb(int row, int col, int angle, int thickness, int length, int depth,String colour) {
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
    public Person buildPerson(int theameIndex){
        Person person = new Person();

//        person.addBody(this.buildBody(10,18,1));
        person.addBody(this.buildBody(15,19,1, PersonColour.getPersonFaceColor(theameIndex)));

        person.addlimbs(this.buildLimb(14,12,30,1,5,1,PersonColour.getPersonBodyColour(theameIndex)));
        person.addlimbs(this.buildLimb(28,15,320,1,5,1,PersonColour.getPersonBodyColour(theameIndex)));
        person.addlimbs(this.buildLimb(19,24,150,1,5,1,PersonColour.getPersonBodyColour(theameIndex)));
        person.addlimbs(this.buildLimb(30,27,220,1,5,1,PersonColour.getPersonBodyColour(theameIndex)));
        person.addlimbs(this.buildLimb(23,13,90,1,1,1,PersonColour.getPersonBodyColour(theameIndex)));


        person.addCircle(this.buildCircle(6,23,7, PersonColour.getPersonFaceColor(theameIndex),1));
        person.addCircle(this.buildCircle(1,21,5,PersonColour.getPersonEyeColor(theameIndex),1));
        person.addCircle(this.buildCircle(1,25,5,PersonColour.getPersonEyeColor(theameIndex),1));
        person.addCrescent(this.buildHalfCircle(23,8,1,PersonColour.getPersonBodyColour(theameIndex),1));

        return person;
    }

}
