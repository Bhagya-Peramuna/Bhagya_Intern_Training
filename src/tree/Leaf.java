package tree;

import common.drawer.Shape;

public class Leaf extends Shape {
        private  int width;
        private int height;

        private String color;

        public Leaf(int row, int col, String color, int depth,int height,int width) {
            super(row, col, depth);
            this.row = row;
            this.col = col;
            this.color = color;
            this.depth = depth;
            this.height = height;
            this.width = width;
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

        public String getColor() {
            return this.color;
        }

      public int getWidth() {
            return this.width;
        }
    }
