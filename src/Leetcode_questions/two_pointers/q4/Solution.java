package Leetcode_questions.two_pointers.q4;

import java.util.HashMap;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int operations = 0;

        for(int num : nums) {
            if(hashMap.containsKey(k - num)) {
                int freq = hashMap.get(k - num);
                if(freq > 1) {
                    hashMap.put(k - num, freq - 1);
                }else{
                    hashMap.remove(k - num);
                }
                operations++;
            }else{
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2));
    }
}
