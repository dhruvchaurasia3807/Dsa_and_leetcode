public class leet1791 {

    public static int findCenter(int[][] edges) {
        int[] first = edges[0]; // a, b
        int[] second = edges[1]; // c, a

        if (first[0] == second[0] || first[0] == second[1]) {
            return first[0];
        }

        return first[1];
    }

    public static void main(String[] args) {

        int[][] edges = {
            {1, 2},
            {2, 3},
            {4, 2}
        };

        int result = findCenter(edges);

        System.out.println("Center of Star Graph: " + result);
    }
}

// output:Center of Star Graph: 2