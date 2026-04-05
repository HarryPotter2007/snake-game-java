import java.util.Random;

public class Board {
    private int rows, cols;
    private Cell[][] grid;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new Cell[rows][cols];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell getcell(int row, int col) {
        return grid[row][col];
    }

    public void generateFood() {
        Random rand = new Random();
        while (true) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            if (grid[r][c].getType() == CellType.EMPTY) {
                grid[r][c].setType(CellType.FOOD);
                break;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j].getType() == CellType.SNAKE) {
                    System.out.print("S ");
                } else if (grid[i][j].getType() == CellType.FOOD) {
                    System.out.print("F ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
