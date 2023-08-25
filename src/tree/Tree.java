package tree;

import common.drawer.Shape;

import java.util.ArrayList;
import java.util.Collection;

public class Tree {

        private Collection<Shape> lines = new ArrayList();
        private Collection<Shape> leaves = new ArrayList();
        private Collection<Shape> rectangles = new ArrayList();
        private Collection<Shape> circles = new ArrayList();

        public void addBranch(Shape line) {
            this.lines.add(line);
        }
        public void addCircle(Shape circle) {
            this.circles.add(circle);
        }

        public Collection<Shape> getBranches() {
            return this.lines;
        }
        public Collection<Shape> getCircles() {
            return this.circles;
        }

        public void addLeaf(Shape leaf) {
            this.leaves.add(leaf);
        }

        public Collection<Shape> getLeaves() {
            return this.leaves;
        }

        public void addTrunk(Shape rectangle) {
            this.rectangles.add(rectangle);
        }

        public Collection<Shape> getTrunks() {
            return this.rectangles;
        }

}
