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

public class SmileyFace implements java.awt.Shape {

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
//    public BufferedImage draw(int width, int height) {
//        // Create a BufferedImage
//        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//        Graphics2D g = image.createGraphics();
//
//        // Clear the image with a background color (white in this case)
//        g.setColor(Color.WHITE);
//        g.fillRect(0, 0, width, height);
//
//        // Iterate through circles and draw them
//        for (common.drawer.Shape circle : circle) {
//            if (circle instanceof Circle) {
//                // Draw the circle using AWT/Swing graphics
//                Circle c = (Circle) circle;
//                g.setColor(Color.decode(c.getColour()));
//                g.fillOval(c.getCol(), c.getRow(), c.getRadius() * 2, c.getRadius() * 2);
//            }
//        }
//
//        // Iterate through crescents and draw them
//        for (Shape crescent : crescent) {
//            if (crescent instanceof Crescent) {
//                // Draw the crescent using AWT/Swing graphics
//                Crescent c = (Crescent) crescent;
//                g.setColor(Color.decode(c.getColour()));
//                // Implement logic to draw crescent here
//            }
//        }
//
//        // Dispose the graphics context
//        g.dispose();
//
//        return image;
//    }




}
