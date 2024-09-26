package neetcode.implementing_data_structures.arrays_and_hashing.q7;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().productExceptSelf(new int[]{1, 2, 4, 6});
        for(int i : ints){
            System.out.println(i);
        }
    }
}
