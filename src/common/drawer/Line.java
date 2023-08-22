package common.drawer;

//import last.tree.TreeCoordinates;

public class Line extends Shape {

    private  String colour;
    private int length;
        private int angle;
        private int thickness;

        public Line(int row, int col, int angle, int thickness, int length, int depth, String colour) {
            super(row, col, depth);
            this.length = length;
            this.angle = angle;
            this.thickness = thickness;
            this.colour =colour;
        }

        public int getLength() {
            return this.length;
        }

        public int getAngle() {
            return this.angle;
        }

        public int getThickness() {
            return this.thickness;
        }

        public int getCol() {
            return this.col;
        }

        public int getRow() {
            return this.row;
        }

    }


