public class MazeSolver {
    public static void main(String[] args) {
        int[][] maze = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };

        System.out.println("Maze Solution Exists: " + solveMaze(maze, 0, 0));
    }

    public static boolean solveMaze(int[][] maze, int x, int y) {
        if( x == maze.length - 1 && y == maze[0].length -1)
            return true;
        if(x < 0 || y < 0 || x >= maze.length || y >= maze[0].length || maze[x][y] == 1)
            return false;
        maze[x][y] = 1; // Mark as visited

        boolean solved = solveMaze(maze, x + 1, y) || solveMaze(maze,x, y + 1) ||
                solveMaze(maze, x -1, y) || solveMaze(maze, x, y -1);

        maze[x][y] = 0; // Reset
        return solved;

    }
}
