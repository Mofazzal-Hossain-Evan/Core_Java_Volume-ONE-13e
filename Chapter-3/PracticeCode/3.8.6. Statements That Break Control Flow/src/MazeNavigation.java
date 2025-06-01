import java.util.Scanner;

public class MazeNavigation {
    public static void main(String[] args) {
        char[][] maze = {
                {' ', ' ', 'X', ' ', 'E'},
                {'X', 'X', ' ', 'X', ' '},
                {' ', ' ', ' ', 'X', ' '},
                {'X', ' ', 'X', ' ', ' '},
                {'S', ' ', ' ', ' ', ' '}
        };

        int x = 4, y = 0; // Starting position
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Maze:");
            for (char[] row : maze) {
                for (char cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
            System.out.print("Move (up, down, left, right): ");
            String move = scanner.nextLine();

            switch (move.toLowerCase()) {
                case "up" -> x = Math.max(0, x - 1);
                case "down" -> x = Math.min(4, x + 1);
                case "left" -> y = Math.max(0, y - 1);
                case "right" -> y = Math.min(4, y + 1);
                default -> {
                    System.out.println("Invalid move. Try again.");
                    continue;
                }
            }
            if(maze[x][y] == 'x') {
                System.out.println("You hit a wall! Try a different direction.");
                continue;
            }

            if (maze[x][y] == 'E') {
                System.out.println("Congratulations! You found the exit!");
                break;
            }
            maze[x][y] = 's';
        }
        scanner.close();
    }
}
/**
 * row and cell are not reserved keywords in Java.
 * They are just variable names chosen by the programmer for clarity.
 * You can replace them with any valid Java variable names, such as r and c,
 * or anything else meaningful to your program.
 * char[][] maze = {
 *     {'#', '#', '#', '#'},
 *     {'#', ' ', ' ', '#'},
 *     {'#', ' ', '#', '#'},
 *     {'#', '#', '#', '#'}
 * };
 *
 * for (char[] r : maze) { // 'r' instead of 'row'
 *     for (char c : r) { // 'c' instead of 'cell'
 *         System.out.print(c + " ");
 *     }
 *     System.out.println(); // Move to the next line after printing the row
 * }
 */