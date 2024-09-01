package Leetcode_questions.array_string.q7;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int left = 1, right = 1;

        // First pass
        for (int i = 0; i < n; i++) {
            answer[i] = left;
            left *= nums[i];
        }

        // Second pass
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        int[] ints = new Solution().productExceptSelf(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ", ");
        }
    }
}
