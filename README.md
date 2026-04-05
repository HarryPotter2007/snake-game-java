# 🐍 Snake Game — Java Console

A terminal-based Snake game built in Java using object-oriented design. Control the snake using your keyboard, eat food to grow, and avoid crashing into yourself or the walls.

---

## 📁 Project Structure

```
SnakeGame/
├── Board.java       # Grid management, food generation, board rendering
├── Cell.java        # Individual cell with position and type
├── CellType.java    # Enum: EMPTY, FOOD, SNAKE
├── Snake.java       # Snake body logic, movement, collision detection
└── Game.java        # Main game loop and input handling
```

---

## 🎮 How to Play

| Key | Direction |
|-----|-----------|
| `W` | Up        |
| `S` | Down      |
| `A` | Left      |
| `D` | Right     |

- **`F`** = Food — eat it to grow
- **`S`** = Snake body
- **`.`** = Empty cell

The game ends when the snake hits a wall or its own body.

---

## 🚀 Getting Started

### Prerequisites
- Java JDK 8 or higher

### Compile

```bash
javac *.java
```

### Run

```bash
java Game
```

---

## 🧱 Architecture

The project follows clean OOP principles with clear separation of concerns:

- **`CellType`** — Enum representing the three possible states of any cell on the board.
- **`Cell`** — Stores a cell's row/column position and its current `CellType`.
- **`Board`** — Holds the 2D grid of cells, handles food spawning and board printing.
- **`Snake`** — Uses a `LinkedList<Cell>` to track the snake's body. Handles movement and self-collision checks.
- **`Game`** — Entry point. Runs the game loop, reads WASD input, and wires everything together.

---

## 📸 Sample Output

```
. . . . . . . . . .
. . . . . . . . . .
. . S . . . . . . .
. . S . . . . . . .
. . S S S . . . . .
. . . . . . . . . .
. . . . . F . . . .
. . . . . . . . . .
. . . . . . . . . .
. . . . . . . . . .
Enter direction (WASD):
```

---

## 🛠️ Built With

- **Java** — Core language
- **LinkedList** — Snake body data structure
- **Enum** — Cell type representation
- **Scanner** — Console input

---

## 📌 Notes

- Board size is fixed at **10×10** (configurable in `Game.java`)
- Snake starts at position **(0, 0)** facing no direction — first move is up to you
- Food spawns randomly on any empty cell

---

## 🙋 Author

**Rux** — [@HarryPotter2007](https://github.com/HarryPotter2007)
