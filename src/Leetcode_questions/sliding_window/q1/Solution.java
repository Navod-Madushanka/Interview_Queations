package Leetcode_questions.sliding_window.q1;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;

        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAvg = (double) sum / k;

        // Slide the window
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            double avg = (double) sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
}
