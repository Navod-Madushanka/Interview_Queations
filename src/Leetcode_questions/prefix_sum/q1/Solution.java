package Leetcode_questions.prefix_sum.q1;

public class Solution {

    public int largestAltitude(int[] gain) {
        int maxHeight = gain[0];
        int[] heights= new int[gain.length];

        heights[0] = gain[0];

        for(int i = 1; i < gain.length; i++) {
            heights[i] = heights[i - 1] + gain[i];
            if(heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
        }

        if(maxHeight < 0) {
            return 0;
        }
        return maxHeight;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
}
