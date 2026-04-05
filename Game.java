import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Game game = new Game();
    game.startGame();
  }

  private Board board;
  private Snake snake;
  private boolean gameover = false;

  public Game() {
    board = new Board(10, 10);
    Cell start = board.getcell(0, 0);
    snake = new Snake(start);
    board.generateFood();
  }

  public void startGame() {
    Scanner sc = new Scanner(System.in);

    while (!gameover) {
      board.printBoard();
      System.out.println("Enter direction (WASD): ");

      char input = sc.next().charAt(0);
      Cell nextcell = getNextCell(input);

      if (nextcell == null || snake.checkCrash(nextcell)) {
        gameover = true;
        System.out.println("Game Over!");
      } else {
        boolean grow = nextcell.getType() == CellType.FOOD;
        snake.move(nextcell, grow);

        if (grow) {
          board.generateFood();
        }
      }
    }
  }

  private Cell getNextCell(char direction) {
    Cell head = snake.getHead();
    int row = head.getRow();
    int col = head.getCol();

    direction = Character.toUpperCase(direction);

    if (direction == 'W') row--;
    else if (direction == 'S') row++;
    else if (direction == 'A') col--;
    else if (direction == 'D') col++;

    if (row < 0 || row >= 10 || col < 0 || col >= 10) {
      return null;
    }

    return board.getcell(row, col);
  }
}