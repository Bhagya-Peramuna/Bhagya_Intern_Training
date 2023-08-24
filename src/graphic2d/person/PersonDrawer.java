package graphic2d.person;

import common.drawer.Circle;
import common.drawer.Crescent;
import common.drawer.Line;
import common.drawer.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.Collection;

public class PersonDrawer extends JPanel {
    private Collection<Shape> branches;
    private Collection<Shape> circle;
    private Collection<Shape> cresent;
//, Collection<Shape> leaves, Collection<Shape> trunks
    public PersonDrawer(Collection<Shape> branches, Collection<Shape> circle, Collection<Shape> cresent) {
        this.branches = branches;
        this.circle = circle;
        this.cresent = cresent;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        if (branches != null) {
            for (Shape branch : branches) {
                Line line = (Line) branch;
                g2d.setColor(Color.magenta);
                g2d.setStroke(new BasicStroke(line.getThickness()));
                System.out.println("Line angle: " + line.getRow());

                double angleInRadians = Math.toRadians(line.getAngle());
                int endX = line.getCol() + (int) (line.getLength() * Math.cos(angleInRadians));
                int endY = line.getRow() + (int) (line.getLength() * Math.sin(angleInRadians));
                g2d.drawLine(line.getCol(), line.getRow(), endX, endY);

            }
        }

        if (circle != null) {
            for (Shape leaf : circle) {
                Circle l = (Circle) leaf;
                if(l.getRadius()==4){
                    g2d.setColor(Color.yellow);
                }else
                    g2d.setColor(Color.GRAY);
                int leafSize = (int) (10 * l.getRadius());
                g2d.fillOval(l.getCol(), l.getRow(), leafSize, leafSize);
            }
        }

        if (cresent != null) {
            for (Shape shape : cresent) {
                Crescent crescent = (Crescent) shape;
                g2d.setColor(Color.magenta);

                int startX = crescent.getCol();
                int startY = crescent.getRow();
                int radius = crescent.getRadius();

                // Calculate the bounding box of the arc
                int x = startX - radius;
                int y = startY - radius;
                int width = radius * 2;
                int height = radius * 2;

                // Start angle and arc angle (adjust these as needed)
                double startAngle = 180;  // Start angle in degrees
                double arcAngle = 180;    // Arc angle in degrees

                // Create an Arc2D object and draw it as a curved line
                Arc2D arc = new Arc2D.Double(x, y, width, height, startAngle, arcAngle, Arc2D.OPEN);
                g2d.draw(arc);
            }
        }
    }

    }
