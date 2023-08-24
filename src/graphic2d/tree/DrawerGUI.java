package graphic2d.tree;//package graphic2d.tree;

import common.drawer.Shape;
import common.drawer.Line;
import common.drawer.Rectangle;
import tree.Leaf;


import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class DrawerGUI extends JPanel {

    private Collection<Shape> branches;
    private Collection<Shape> leaves;
    private Collection<Shape> trunks;
    private final int gridSize = 100;
    public DrawerGUI(Collection<Shape> branches, Collection<Shape> leaves, Collection<Shape> trunks) {
        this.branches = branches;
        this.leaves = leaves;
        this.trunks = trunks;
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
                g2d.setColor(Color.magenta);
                g2d.fillRect(rectangle.getCol(), rectangle.getRow(), rectangle.getWidth(), rectangle.getHeight());
            }
        }

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

        if (leaves != null) {
            for (Shape leaf : leaves) {
                Leaf l = (Leaf) leaf;
                g2d.setColor(new Color(0, 128, 0));
                int leafSize = (int) (10 * l.getRadius());
                g2d.fillOval(l.getCol(), l.getRow(), leafSize, leafSize);
            }
        }
    }


}
