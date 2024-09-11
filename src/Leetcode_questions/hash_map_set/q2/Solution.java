package Leetcode_questions.hash_map_set.q2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrenceMap = new HashMap();

        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> occurrenceSet = new HashSet();

        for (int num : occurrenceMap.values()) {
            if (!occurrenceSet.add(num)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniqueOccurrences(new int[] {1,2,2,1,1,3}));
    }
}
