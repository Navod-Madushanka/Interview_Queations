package Leetcode_questions.two_pointers.q2;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(solution.isSubsequence(s, t));
    }
}
