package neetcode.implementing_data_structures.arrays_and_hashing.q1;

import java.util.HashSet;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return true;
            }
            hashSet.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hasDuplicate(new int[]{1, 2, 3}));
    }
}
