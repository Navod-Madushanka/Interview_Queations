package Leetcode_questions.hash_map_set.q1;


import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Create sets for nums1 and nums2
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add elements to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Find distinct elements in nums1 that are not in nums2
        List<Integer> list1 = new ArrayList<>(set1);
        list1.removeAll(set2);  // Removes elements present in set2 from list1

        // Find distinct elements in nums2 that are not in nums1
        List<Integer> list2 = new ArrayList<>(set2);
        list2.removeAll(set1);  // Removes elements present in set1 from list2

        // Prepare the answer as a list of two lists
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);

        return ans;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> difference = solution.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});

        for(List<Integer> list : difference){
            System.out.println(list);
        }
    }
}
