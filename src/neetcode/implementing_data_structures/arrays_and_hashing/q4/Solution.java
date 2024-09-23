package neetcode.implementing_data_structures.arrays_and_hashing.q4;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] counts = new int[26];
            for (char c : str.toCharArray()) {
                counts[c - 'a']++;
            }

            String key = Arrays.toString(counts);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> lists = solution.groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"});
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
}
