package Leetcode_questions.dfs.q1;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: root = [3,9,20,null,null,15,7]
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode root1 = new TreeNode(3, node9, node20);
        System.out.println("Maximum Depth of Example 1: " + solution.maxDepth(root1)); // Expected output: 3

        // Example 2: root = [1,null,2]
        TreeNode node2 = new TreeNode(2);
        TreeNode root2 = new TreeNode(1, null, node2);
        System.out.println("Maximum Depth of Example 2: " + solution.maxDepth(root2)); // Expected output: 2

        // Example 3: root = null (Empty tree)
        TreeNode root3 = null;
        System.out.println("Maximum Depth of Example 3: " + solution.maxDepth(root3)); // Expected output: 0

        // Example 4: root = [1]
        TreeNode root4 = new TreeNode(1);
        System.out.println("Maximum Depth of Example 4: " + solution.maxDepth(root4)); // Expected output: 1
    }
}
