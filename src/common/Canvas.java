package common;

public class Canvas {
        public String[][] grid;

        public Canvas(int rows, int columns) {
            this.grid = new String[rows][columns];
            this.initializeGrid(rows, columns);
        }

        public void initializeGrid(int rows, int columns) {
            for(int i = 0; i < rows; ++i) {
                for(int j = 0; j < columns; ++j) {
                    this.grid[i][j] = " ";
                }
            }

        }

        public void displayBoarder(int rows, int columns) {
            int i;
            int starColumn;
            for(i = 0; i < rows - 1; ++i) {
                starColumn = 0;
                this.grid[i][starColumn] = "\u001b[44m \u001b[0m";
            }

            int j;
            for(i = 0; i < columns; ++i) {
                j = 0;
                this.grid[j][i] = "\u001b[44m \u001b[0m";
            }

            for(i = 0; i < rows - 1; ++i) {
                starColumn = columns - 1;
                this.grid[i][starColumn] = "\u001b[44m \u001b[0m";
            }

            for(i = 0; i < columns; ++i) {
                j = rows - 1;
                this.grid[j][i] = "\u001b[44m \u001b[0m";
            }

            for(i = 0; i < rows; ++i) {
                for(j = 0; j < columns; ++j) {
                    System.out.print(this.grid[i][j]);
                }

                System.out.println();
            }

        }

        public String[][] getCanvas() {
            return this.grid;
        }

}
