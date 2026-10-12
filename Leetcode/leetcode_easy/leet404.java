public class leet404{

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int sum(TreeNode curr, TreeNode parent) {
        if (curr == null)
            return 0;

        int left = sum(curr.left, curr);
        int right = sum(curr.right, curr);

        int sum = 0;

        if (curr.left == null && curr.right == null) {
            if (parent != null && parent.left == curr)
                sum += curr.val;
        }

        return left + right + sum;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;

        TreeNode parent = null;
        return sum(root, parent);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        leet404 obj = new leet404();

        System.out.println(obj.sumOfLeftLeaves(root));
    }
}

// output:24