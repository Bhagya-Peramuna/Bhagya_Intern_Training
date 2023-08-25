package face;

import common.drawer.Circle;
import common.drawer.Crescent;
import common.drawer.Shape;

import java.util.ArrayList;
import java.util.Collection;

//public class SmileyFace implements java.awt.Shape  {
public class SmileyFace  {

    private Collection<Shape>circle = new ArrayList<>();
    private Collection<Shape> crescent = new ArrayList<>();

    public void addCircle(Shape circle){
        this.circle.add(circle);
    }

    public Collection<Shape> getCircle() {
        return this.circle;
    }

    public void addCrescent(Shape crescent){
        this.crescent.add(crescent);
    }

    public Collection<Shape> getCrescent() {
        return crescent;
    }

    public SmileyFace(Collection<Circle> circles, Collection<Crescent> crescents) {
        this.circle = circle;
        this.crescent = crescent;
    }


}
