import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> body = new LinkedList<>();
    private Cell head;

    public Snake(Cell start) {
        head = start;
        body.add(head);
        head.setType(CellType.SNAKE);
    }

    public Cell getHead() {
        return head;
    }

    public void move(Cell next, boolean grow) {
        head = next;
        body.addFirst(next);

        if (!grow) {
            Cell tail = body.removeLast();
            tail.setType(CellType.EMPTY);
        }

        head.setType(CellType.SNAKE);
    }

    public boolean checkCrash(Cell next) {
        return body.contains(next); // cleaner than manual loop
    }
}