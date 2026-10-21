
import java.util.Arrays;

public class leet2373 {

    private static int findLocalMax(int[][] grid, int x, int y) {
        int maxElement = 0;

        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                maxElement = Math.max(maxElement, grid[i][j]);
            }
        }

        return maxElement;
    }

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxLocal[i][j] = findLocalMax(grid, i, j);
            }
        }

        return maxLocal;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {9, 9, 8, 1},
            {5, 6, 2, 6},
            {8, 2, 6, 4},
            {6, 2, 2, 2}
        };

        int[][] result = largestLocal(grid);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}

// output:
// [9, 9]
// [8, 6]
