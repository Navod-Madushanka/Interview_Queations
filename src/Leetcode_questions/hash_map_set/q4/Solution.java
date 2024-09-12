package Leetcode_questions.hash_map_set.q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        // List to store rows
        List<List<Integer>> rows = new ArrayList<>();

        // Store each row in the rows list
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            rows.add(row);
        }

        // Compare each row with each column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isEqual = true;
                for (int k = 0; k < n; k++) {
                    if (grid[k][j] != rows.get(i).get(k)) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] grid = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };

        System.out.println(solution.equalPairs(grid));
    }
}
