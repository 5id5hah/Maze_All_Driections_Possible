# 🧭 AllDirections Maze Solver

This Java program explores all possible paths from the top-left to the bottom-right of a maze using backtracking. The maze is represented as a 2D boolean array, where `true` indicates a walkable cell.

## 🚀 Features

- **Recursive Pathfinding**: Explores all directions—Down (`D`), Right (`H`), Left (`L`), and Up (`U`).
- **Backtracking**: Prevents revisiting cells by marking them as false during exploration.
- **State Reset**: Resets cells to their original state after all possible paths are checked.

## 🧩 Code Example

```java
public class AllDirections {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}};
        AllDir("", maze, 0, 0);
    }

    static void AllDir(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        // Mark the visited block as false so it won't be visited again
        maze[r][c] = false;

        // Explore Down
        if (r < maze.length - 1) {
            AllDir(p + 'D', maze, r + 1, c);
        }
        // Explore Right
        if (c < maze[0].length - 1) {
            AllDir(p + 'H', maze, r, c + 1);
        }
        // Explore Left
        if (c > 0) {
            AllDir(p + 'L', maze, r, c - 1);
        }
        // Explore Up
        if (r > 0) {
            AllDir(p + 'U', maze, r - 1, c);
        }

        // Reset the block to its original state
        maze[r][c] = true;
    }
}
