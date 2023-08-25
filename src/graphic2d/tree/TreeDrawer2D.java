package graphic2d.tree;//package graphic2d.tree;

import common.drawer.Circle;
import common.drawer.Line;
import common.drawer.Rectangle;
import common.drawer.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class TreeDrawer2D extends JPanel {

    private Collection<Shape> branches;
    private Collection<Shape> leaves;
    private Collection<Shape> trunks;
//    private Collection<Shape> circle;
    private final int gridSize = 100;
    public TreeDrawer2D(Collection<Shape> branches, Collection<Shape> leaves, Collection<Shape> trunks) {
        this.branches = branches;
        this.leaves = leaves;
        this.trunks = trunks;
//        this.circle = circle;
    }




    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.LIGHT_GRAY);
        for (int x = 0; x < getWidth(); x += gridSize) {
            g2d.drawLine(x, 0, x, getHeight());
        }
        for (int y = 0; y < getHeight(); y += gridSize) {
            g2d.drawLine(0, y, getWidth(), y);
        }


        if (trunks != null) {
            for (Shape trunk : trunks) {
                Rectangle rectangle = (Rectangle) trunk;
//                System.out.println("\n height"+getHeight());
//                g2d.setColor(Color.magenta);
                g2d.fillRect(rectangle.getCol(), rectangle.getRow(), rectangle.getWidth(), rectangle.getHeight());
            }
        }

        if (branches != null) {
            for (Shape branch : branches) {
                Line line = (Line) branch;
                g2d.setColor(Color.magenta);
                g2d.setStroke(new BasicStroke(line.getThickness()));


                double angleInRadians = Math.toRadians(line.getAngle());
                int endX = line.getCol() + (int) (line.getLength() * Math.cos(angleInRadians));
                int endY = line.getRow() + (int) (line.getLength() * Math.sin(angleInRadians));
                g2d.drawLine(line.getCol(), line.getRow(), endX, endY);

            }
        }

        if (leaves != null) {
            for (Shape leaf : leaves) {
                Circle l = (Circle) leaf;
                System.out.println("Line angle: " + leaf.getRow());
                if(l.getRadius()==4){
                    g2d.setColor(Color.yellow);
                }else
                 g2d.setColor(new Color(0, 128, 0));
                int leafSize = (int) (10 * l.getRadius());
                g2d.fillOval(l.getCol(), l.getRow(), leafSize, leafSize);
            }
        }


//        if (circle != null) {
//            for (Shape circle : circle) {
//                Circle l = (Circle) circle;
//                if(l.getRadius()==4){
//                    g2d.setColor(Color.yellow);
//                }else
//                    g2d.setColor(Color.GRAY);
//                int leafSize = (int) (10 * l.getRadius());
//                g2d.fillOval(l.getCol(), l.getRow(), leafSize, leafSize);
//            }
//        }

    }


}
