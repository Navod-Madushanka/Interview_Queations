package Leetcode_questions.array_string.q6;

public class Solution {
    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public String reverseWords(String s) {
        s = s.trim();
        s = s = s.replaceAll("\\s+", " ");

        char[] charArray = s.toCharArray();

        reverse(charArray, 0, charArray.length - 1);

        int start = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                reverse(charArray, start, i - 1);
                start = i + 1;
            }
        }

        reverse(charArray, start, charArray.length - 1);

        return new String(charArray);

    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("a good   example"));
    }
}
