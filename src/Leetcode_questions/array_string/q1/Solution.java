package Leetcode_questions.array_string.q1;

public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int i = 0;

        // Merge characters alternately
        while (i < length1 && i < length2) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
            i++;
        }

        // Append the remaining characters from word1, if any
        if (i < length1) {
            merged.append(word1.substring(i));
        }

        // Append the remaining characters from word2, if any
        if (i < length2) {
            merged.append(word2.substring(i));
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcd"
    }
}
