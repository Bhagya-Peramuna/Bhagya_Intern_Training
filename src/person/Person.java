package person;

import common.drawer.Shape;
import face.SmileyFace;

import java.util.ArrayList;
import java.util.Collection;

public class Person extends SmileyFace {


    private Collection<Shape> body= new ArrayList();
    private Collection<Shape> limbs = new ArrayList();


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
