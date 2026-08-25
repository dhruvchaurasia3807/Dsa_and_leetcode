public class leet1582 {

    public static int numSpecial(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        // Count 1s in each row and column
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                if (mat[row][col] == 1) {
                    rowCount[row]++;
                    colCount[col]++;
                }
            }
        }

        int result = 0;

        // Check special positions
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                if (mat[row][col] == 1) {

                    if (rowCount[row] == 1 && colCount[col] == 1) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 0, 0},
            {0, 0, 1},
            {1, 0, 0}
        };

        int result = numSpecial(mat);

        System.out.println("Number of special positions: " + result);
    }
}

// output:Number of special positions: 1