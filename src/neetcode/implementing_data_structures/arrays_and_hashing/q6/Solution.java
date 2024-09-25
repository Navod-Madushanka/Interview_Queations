package neetcode.implementing_data_structures.arrays_and_hashing.q6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> stringList = new ArrayList<>();
        stringList.add("neet");
        stringList.add("code");
        stringList.add("love");
        stringList.add("you");
        System.out.println(solution.encode(stringList));
    }
}
