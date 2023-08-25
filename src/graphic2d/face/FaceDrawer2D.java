package graphic2d.face;

import common.drawer.Circle;
import common.drawer.Crescent;
import common.drawer.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.Collection;


public class FaceDrawer2D extends JPanel{

        private Collection<Shape> circles;

        private Collection<Shape> crescent;

        private final int gridSize = 100;
        public FaceDrawer2D(Collection<Shape> circles, Collection<Shape> crescent) {
            this.circles = circles;
            this.crescent = crescent;


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

            if (circles != null) {
                for (Shape leaf : circles) {
                    Circle l = (Circle) leaf;
                    if(l.getRadius()==4){
                        g2d.setColor(Color.yellow);
                    }else
                        g2d.setColor(Color.GRAY);
                    int leafSize = (int) (10 * l.getRadius());
                    g2d.fillOval(l.getCol(), l.getRow(), leafSize, leafSize);
                }
            }
            if (crescent != null) {
                for (Shape shape : crescent) {
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
