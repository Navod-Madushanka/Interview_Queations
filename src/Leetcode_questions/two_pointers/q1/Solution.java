package Leetcode_questions.two_pointers.q1;

public class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }

        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }

        for(int a : nums){
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.moveZeroes(new int[]{0,0,1});
    }
}
