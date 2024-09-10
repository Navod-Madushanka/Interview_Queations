package Leetcode_questions.prefix_sum.q2;

import java.util.HashSet;

public class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        for(int i = 0; i<nums.length; i++){
            if(leftSum == totalSum - leftSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(new int[] {1,7,3,6,5,6}));
    }
}
