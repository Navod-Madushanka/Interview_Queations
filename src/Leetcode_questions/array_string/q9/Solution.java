package Leetcode_questions.array_string.q9;

public class Solution {

    public int compress(char[] chars) {
        int write_index = 0;  // where to write the result
        int i = 0;            // current index in the chars array

        while (i < chars.length) {
            char current_char = chars[i];
            int count = 0;

            // Count the number of occurrences of the current character
            while (i < chars.length && chars[i] == current_char) {
                i++;
                count++;
            }

            // Write the character to the array
            chars[write_index] = current_char;
            write_index++;

            // If the character occurs more than once, write the count
            if (count > 1) {
                // Convert the count to a string and write each digit
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write_index] = c;
                    write_index++;
                }
            }
        }

        return write_index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] arr = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int compress = solution.compress(arr);
        System.out.println(compress);
    }

}
