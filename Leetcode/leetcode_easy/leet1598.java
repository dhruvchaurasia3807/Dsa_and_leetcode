public class leet1598 {

    public static int minOperations(String[] logs) {
        int depth = 0;

        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                depth = Math.max(0, depth - 1);
            }
            else if (!logs[i].equals("./")) {
                depth++;
            }
        }

        return depth;
    }

    public static void main(String[] args) {

        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};

        int result = minOperations(logs);

        System.out.println("Minimum Operations: " + result);
    }
}


// output:Minimum Operations: 2