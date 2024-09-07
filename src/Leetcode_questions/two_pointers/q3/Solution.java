package Leetcode_questions.two_pointers.q3;


public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);

            maxArea = Math.max(maxArea, area);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
