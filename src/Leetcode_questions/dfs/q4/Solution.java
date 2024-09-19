package Leetcode_questions.dfs.q4;

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

    private int maxZigzagLength = 0;

    private void dfs(TreeNode node, boolean isLeft, int length) {
        if (node == null) return;

        maxZigzagLength = Math.max(maxZigzagLength, length);

        if(isLeft){
            dfs(node.left, false, length+1);
            dfs(node.right, true, 1);
        }else{
            dfs(node.right, true, length+1);
            dfs(node.left, false, 1);
        }
    }

    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;

        dfs(root, true, 0);
        dfs(root, false, 0);
        return maxZigzagLength;
    }
}
