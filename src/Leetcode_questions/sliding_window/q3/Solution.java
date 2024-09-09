package Leetcode_questions.sliding_window.q3;

public class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int zeroCount = 0;

        // Iterate over the array using the right pointer
        for (int right = 0; right < nums.length; right++) {
            // If we encounter a 0, increase the zero count
            if (nums[right] == 0) {
                zeroCount++;
            }

            // If zeroCount exceeds k, shrink the window from the left
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update the maximum length of the window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}
