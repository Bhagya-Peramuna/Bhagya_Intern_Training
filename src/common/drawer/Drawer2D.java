package common.drawer;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.Collection;
    public class Drawer2D extends JPanel {

        private Collection<Shape> circles;
        private Collection<Shape> crescents;
        private Collection<Shape> branches;
        private Collection<Shape> trunks;
        private final int gridSize = 100;

        public Drawer2D(Collection<Shape> circles, Collection<Shape> crescents, Collection<Shape> branches, Collection<Shape> trunks) {
            this.circles = circles;
            this.crescents = crescents;
            this.branches = branches;
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

            // Draw circles (faces)
            if (circles != null) {
                for (Shape leaf : circles) {
                    Circle l = (Circle) leaf;
                    if (l.getRadius() == 4) {
                        g2d.setColor(Color.yellow);
                    } else {
                        g2d.setColor(Color.GRAY);
                    }
                    int leafSize = (int) (10 * l.getRadius());
                    g2d.fillOval(l.getCol(), l.getRow(), leafSize, leafSize);
                }
            }

            // Draw crescents (faces)
            if (crescents != null) {
                for (Shape shape : crescents) {
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

            // Draw lines (persons)
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

            // Draw rectangles (trunks)
            if (trunks != null) {
                for (Shape trunk : trunks) {
                    Rectangle rectangle = (Rectangle) trunk;
                    g2d.setColor(Color.magenta);
                    g2d.fillRect(rectangle.getCol(), rectangle.getRow(), rectangle.getWidth(), rectangle.getHeight());
                }
            }
        }
    }


