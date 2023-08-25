package face;

import common.drawer.Circle;
import common.drawer.Crescent;
import common.drawer.Shape;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Collection;

public class SmileyFace implements java.awt.Shape  {

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

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }

}
