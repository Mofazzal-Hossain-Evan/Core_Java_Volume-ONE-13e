import java.util.Arrays;

public class NumberGrid {
    
    public static void main(String[] args) {
        
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int[] row : grid) {
            for (int num : row) {
                total += num;
                if(num > max) max = num;
                if (num < min) min = num;
            }
        }
        
        System.out.println("Grid: " + Arrays.deepToString(grid));
        System.out.println("Total Sum: " + total);
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
    
}
