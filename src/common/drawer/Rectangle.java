package common.drawer;

public class Rectangle extends Shape {
        private int width;
        private int height;
        private String colour;

        public Rectangle(int width, int height, int row, int col, int depth, String colour) {
            super(row, col, depth);
            this.width = width;
            this.height = height;
            this.row = row;
            this.col = col;
            this.colour = colour;
        }

        public int getWidth() {
            return this.width;
        }

        public int getHeight() {
            return this.height;
        }

        public int getRow() {
            return this.row;
        }

        public int getCol() {
            return this.col;
        }

    public String getColour() {
        return colour;
    }
}


