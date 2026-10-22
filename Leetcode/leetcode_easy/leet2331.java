import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class leet2331 {

    public static boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val != 0;
        }

        if (root.val == 2) {
            return evaluateTree(root.left) | evaluateTree(root.right);
        }

        return evaluateTree(root.left) & evaluateTree(root.right);
    }

    public static void main(String[] args) {

        // JCF: ArrayList stores the tree node values
        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(2, 1, 3, 0, 1)
        );

        // Creating the binary tree
        TreeNode root = new TreeNode(list.get(0));
        root.left = new TreeNode(list.get(1));
        root.right = new TreeNode(list.get(2));
        root.right.left = new TreeNode(list.get(3));
        root.right.right = new TreeNode(list.get(4));

        System.out.println(evaluateTree(root));
    }
}

// output:true