package Leetcode_questions.hash_map_set.q3;

import java.util.*;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        // Step 1: If lengths are not the same, return false
        if (word1.length() != word2.length()) {
            return false;
        }

        // Step 2: HashMaps to store character frequencies
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();

        // Step 3: HashSets to store unique characters
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        // Step 4: Fill freq1, set1 for word1
        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
            set1.add(c);
        }

        // Fill freq2, set2 for word2
        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
            set2.add(c);
        }

        // Step 5: Check if unique character sets are the same
        if (!set1.equals(set2)) {
            return false;
        }

        // Step 6: Compare frequency distributions
        List<Integer> freqList1 = new ArrayList<>(freq1.values());
        List<Integer> freqList2 = new ArrayList<>(freq2.values());

        Collections.sort(freqList1);
        Collections.sort(freqList2);

        return freqList1.equals(freqList2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.closeStrings("cabbba", "aabbss"));
    }
}
