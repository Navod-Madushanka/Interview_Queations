package Leetcode_questions.dfs.q2;

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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public int dfs(TreeNode node, int maxSoFar) {
        if (node == null) return 0;

        int count = 0;

        if(node.val >= maxSoFar){
            count = 1;
        }

        maxSoFar = Math.max(maxSoFar, node.val);

        count += dfs(node.left, maxSoFar);
        count += dfs(node.right, maxSoFar);

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: root = [3,1,4,3,null,1,5]
        TreeNode root1 = new TreeNode(3,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5))
        );
        System.out.println("Example 1: " + solution.goodNodes(root1)); // Expected output: 4

        // Example 2: root = [3,3,null,4,2]
        TreeNode root2 = new TreeNode(3,
                new TreeNode(3, new TreeNode(4), new TreeNode(2)),
                null
        );
        System.out.println("Example 2: " + solution.goodNodes(root2)); // Expected output: 3

        // Example 3: root = [1]
        TreeNode root3 = new TreeNode(1);
        System.out.println("Example 3: " + solution.goodNodes(root3));
    }
}
