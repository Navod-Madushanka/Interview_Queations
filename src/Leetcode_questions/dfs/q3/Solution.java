package Leetcode_questions.dfs.q3;

import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        // HashMap to store the prefix sums and their frequency
        HashMap<Long, Integer> prefixSumMap = new HashMap<>();
        // Initialize with a base case: the prefix sum of 0 has occurred once
        prefixSumMap.put(0L, 1);
        // Start the DFS traversal
        return dfs(root, 0L, targetSum, prefixSumMap);
    }

    private int dfs(TreeNode node, long currentSum, int targetSum, HashMap<Long, Integer> prefixSumMap) {
        if (node == null) {
            return 0;
        }

        // Update the current prefix sum by adding the node's value
        currentSum += node.val;

        // Calculate the number of valid paths that end at this node
        int count = prefixSumMap.getOrDefault(currentSum - targetSum, 0);

        // Update the prefixSumMap with the current prefix sum
        prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

        // Recur for the left and right children
        count += dfs(node.left, currentSum, targetSum, prefixSumMap);
        count += dfs(node.right, currentSum, targetSum, prefixSumMap);

        // Backtrack: Remove the current prefix sum from the map
        prefixSumMap.put(currentSum, prefixSumMap.get(currentSum) - 1);

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case: root = [1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000], targetSum = 1000000000
        TreeNode root = new TreeNode(1000000000);
        root.left = new TreeNode(1000000000);
        root.left.left = new TreeNode(294967296);
        root.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left.left = new TreeNode(1000000000);

        System.out.println("Result: " + solution.pathSum(root, 1000000000));  // Expected output: 4
    }
}

