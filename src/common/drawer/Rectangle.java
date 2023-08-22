package common.drawer;

public class Rectangle extends Shape {
        private int width;
        private int height;

        public Rectangle(int width, int height, int row, int col, int depth) {
            super(row, col, depth);
            this.width = width;
            this.height = height;
            this.row = row;
            this.col = col;
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
    }


