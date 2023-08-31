package common.drawer;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.Collection;

public class DrawerGUI extends JPanel {
    private Collection<Shape> items;

    private final int gridSize = 100;

    public DrawerGUI(Collection<Shape> items) {
        this.items = items;
    }



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


        if (items != null) {

            for (Shape shape : items) {
                if (shape instanceof Rectangle) {
                    Rectangle rectangle = (Rectangle) shape;
//                System.out.println("\n height"+getHeight());
                    g2d.fillRect(rectangle.getCol(), rectangle.getRow(), rectangle.getWidth(), rectangle.getHeight());
                }
            }
        }

        if (items != null) {
            for (Shape shape : items) {
                {
                    if (shape instanceof Line) {
                        Line line = (Line) shape;
                        g2d.setColor(Color.lightGray);
                        g2d.setStroke(new BasicStroke(line.getThickness()));


                        double angleInRadians = Math.toRadians(line.getAngle());
                        int endX = line.getCol() + (int) (line.getLength() * Math.cos(angleInRadians));
                        int endY = line.getRow() + (int) (line.getLength() * Math.sin(angleInRadians));
                        g2d.drawLine(line.getCol(), line.getRow(), endX, endY);
                    }
                }
            }

            if (items != null) {
                for (Shape shape : items) {
                    {
                        if (shape instanceof Circle) {

                            Circle l = (Circle) shape;

                            if (l.getRadius() == 4) {
                                g2d.setColor(Color.yellow);
                            } else
                                g2d.setColor(new Color(0, 128, 0));
                            int leafSize = (int) (10 * l.getRadius());
                            g2d.fillOval(l.getCol(), l.getRow(), leafSize, leafSize);
                        }
                    }
                }
                if (items != null) {
                    for (Shape shape : items) {
                        if (shape instanceof Crescent) {

                            Crescent crescent = (Crescent) shape;
                            g2d.setColor(Color.magenta);

                            int startX = crescent.getCol();
                            int startY = crescent.getRow();
                            int radius = crescent.getRadius();

                            int x = startX - radius;
                            int y = startY - radius;
                            int width = radius * 2;
                            int height = radius * 2;

                            double startAngle = 180;
                            double arcAngle = 180;

                            Arc2D arc = new Arc2D.Double(x, y, width, height, startAngle, arcAngle, Arc2D.OPEN);
                            g2d.draw(arc);
                        }
                    }
                }
            }
        }
    }

}
