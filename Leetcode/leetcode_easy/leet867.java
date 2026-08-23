public class leet867 {

    public static void main(String[] args) {

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int m = A.length;       // rows = 2
        int n = A[0].length;   // columns = 3

        // Transpose will have 3 rows and 2 columns
        int[][] result = new int[n][m];

        // Transpose logic
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                result[j][i] = A[i][j];
            }
        }

        // Print result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}