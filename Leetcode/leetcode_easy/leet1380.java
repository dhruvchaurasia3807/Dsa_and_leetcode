
import java.util.*;

public class leet1380 {

    public static List<Integer> luckyNumbers(int[][] matrix) {

        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        int rMinMax = Integer.MIN_VALUE;

        // Find minimum element in each row
        for (int row = 0; row < m; row++) {

            int rMin = Integer.MAX_VALUE;

            for (int col = 0; col < n; col++) {
                rMin = Math.min(rMin, matrix[row][col]);
            }

            rMinMax = Math.max(rMinMax, rMin);
        }

        // Find maximum element in each column
        int cMaxMin = Integer.MAX_VALUE;

        for (int col = 0; col < n; col++) {

            int cMax = Integer.MIN_VALUE;

            for (int row = 0; row < m; row++) {
                cMax = Math.max(cMax, matrix[row][col]);
            }

            cMaxMin = Math.min(cMaxMin, cMax);
        }

        List<Integer> result = new ArrayList<>();

        if (rMinMax == cMaxMin) {
            result.add(rMinMax);
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };

        List<Integer> result = luckyNumbers(matrix);

        System.out.println(result);
    }
}


// output:[15]  lucky number