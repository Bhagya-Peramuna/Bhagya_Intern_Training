package person;

import common.drawer.*;
import face.SmileyFace;

import java.util.ArrayList;
import java.util.Collection;

public class Person extends SmileyFace {


    private Collection<Shape> body= new ArrayList();
    private Collection<Shape> limbs = new ArrayList();

    public Person(Collection<Circle> circles, Collection<Crescent> crescents) {
        super(circles, crescents);
        this.body = new ArrayList<>();
        this.limbs = new ArrayList<>();
    }

    public Person(Collection<Circle> circles, Collection<Crescent> crescents, Collection<Rectangle> body, Collection<Line> limbs) {
        super(circles, crescents);
    }

    public Person(Collection<Circle> circle, Collection<Crescent> cresent, Collection<Line> branch) {
        super(circle, cresent);
    }


    public void addBody(Shape body) {
        this.body.add(body);
    }
    public void addlimbs(Shape line) {
        this.limbs.add(line);
    }
    public Collection<Shape> getBody() {
        return this.body;
    }
    public Collection<Shape> getLimbs() {
        return this.limbs;
    }

}
