package common.drawer;

import common.Canvas;
import last.tree.Leaf;
import last.tree.TreeColour;

import java.util.Collection;
import java.util.Iterator;

public class Drawer {
    public static Canvas canvas;

    public Drawer(int canvasWidth, int canvasHeight) {
        this.canvas = new Canvas(canvasWidth, canvasHeight);
    }
    public void draw(Collection<Shape> items) {
        Iterator var2 = items.iterator();
        for (int z = Shape.getDepth(); z >= 0; z--) {
            while (var2.hasNext()) {
                Object item = var2.next();
                if (item instanceof Rectangle) {
                    drawRectangleOnCanvas((Rectangle) item);
                } else if (item instanceof Line) {
                    drawLineOnCanvas((Line) item);
                }  else if (item instanceof Leaf) {
                    drawLeafOnCanvas((Leaf) item);
                }else if (item instanceof Circle) {
                   drawCircleOnCanvas((Circle) item);
                }else if (item instanceof Crescent) {
                    drawHalfCircleOnCanvas((Crescent) item);
                }

            }

        }
    }
    public void displayframe() {
        this.canvas.displayBoarder(30, 60);
    }

    public static void drawRectangleOnCanvas(Rectangle rectangle) {

        for(int trow = rectangle.getRow(); trow < rectangle.getRow() + rectangle.getHeight(); ++trow) {
            for(int tcol = rectangle.getCol(); tcol < rectangle.getCol() + rectangle.getWidth(); ++tcol) {
                canvas.getCanvas()[trow][tcol] = TreeColour.getTrunckColour();

            }
        }
    }

    public static void drawLineOnCanvas(Line line) {

        double radians = Math.toRadians((double) line.getAngle());
        int halfThickness = line.getThickness() / 2;

        for(int i = 0; i <= line.getLength(); ++i) {
            for(int t = -halfThickness; t <= halfThickness; ++t) {
                double offset = (double)t * 0.5;
                int lcol = (int)Math.round((double) line.getCol() + (double)i * Math.cos(radians) + offset * Math.sin(radians));
                int lrow = (int)Math.round((double) line.getRow() + (double)i * Math.sin(radians) - offset * Math.cos(radians));
                canvas.getCanvas()[lrow][lcol] = TreeColour.getBranchColour();

            }
        }
    }

    public static void drawLeafOnCanvas(Leaf leaf) {

        int startX = leaf.getCol() - leaf.getWidth()/ 2;
        int startY = leaf.getRow() - leaf.getHeight() / 2;
        String color = leaf.getColor();

        for (int x = startX; x < startX + leaf.getWidth(); x++) {
            plotPixel(canvas.getCanvas(), x, startY, color);
            plotPixel(canvas.getCanvas(), x, startY + leaf.getHeight() - 1, color);
        }

        for (int y = startY; y < startY + leaf.getHeight(); y++) {
            plotPixel(canvas.getCanvas(), startX, y, color);
            plotPixel(canvas.getCanvas(), startX + leaf.getWidth() - 1, y, color);
        }
    }

    public static void drawCircleOnCanvas(Circle circle){
        for (int angle = 0; angle < 360; angle++) {
            double radians = Math.toRadians(angle);
            int x = (int) Math.round(circle.getCol() + circle.getRadius() * Math.cos(radians));
            int y = (int) Math.round(circle.getRow() + circle.getRadius() * Math.sin(radians));

            Drawer.plotPixel(canvas.getCanvas(), x, y, circle.getColour());
        }
    }
    public static void drawHalfCircleOnCanvas(Crescent crescent){
        for (int angle = 0; angle < 180; angle++) {
            double radians = Math.toRadians(angle);
            int x = (int) Math.round(crescent.getCol() + crescent.getRadius() * Math.cos(radians));
            int y = (int) Math.round(crescent.getRow() + crescent.getRadius() * Math.sin(radians));
            Drawer.plotPixel(canvas.getCanvas(), x, y, crescent.getColour());
        }

    }
    protected static void plotPixel(String[][] grid, int x, int y, String color) {
        if (x >= 0 && x < grid[0].length && y >= 0 && y < grid.length) {
            grid[y][x] = color;
        }
    }


}
