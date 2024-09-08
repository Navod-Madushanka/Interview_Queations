package Leetcode_questions.sliding_window.q2;

import java.util.Set;

public class Solution {

    public int maxVowels(String s, int k) {
        int maxVowelCount = 0;
        int currentVowelCount = 0;

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        // Initialize the sliding window with the first k characters
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowelCount++;
            }
        }

        maxVowelCount = currentVowelCount;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            // If the current vowel count is already greater than the maximum,
            // there's no need to continue
            if (currentVowelCount >= k) {
                break;
            }

            // Add the new character and remove the old character
            if (vowels.contains(s.charAt(i))) {
                currentVowelCount++;
            }

            // Only decrement the vowel count if the previous character was a vowel
            if (vowels.contains(s.charAt(i - k))) {
                currentVowelCount--;
            }

            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        }

        return maxVowelCount;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxVowels("abciiidef", 3));
    }

}
