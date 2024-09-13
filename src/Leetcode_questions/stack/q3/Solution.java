package Leetcode_questions.stack.q3;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                // If the character is a number, we may need to handle multi-digit numbers.
                currentNumber = currentNumber * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current number and string into the respective stacks.
                countStack.push(currentNumber);
                stringStack.push(currentString.toString());
                currentNumber = 0;  // Reset the number.
                currentString = new StringBuilder();  // Start a new substring.
            } else if (ch == ']') {
                // Pop the count from the count stack.
                int repeatTimes = countStack.pop();
                StringBuilder decodedString = new StringBuilder(stringStack.pop());

                // Repeat the current string the popped number of times.
                for (int j = 0; j < repeatTimes; j++) {
                    decodedString.append(currentString);
                }

                // Set the current string to the decoded result.
                currentString = decodedString;
            } else {
                // Append normal characters to the current string.
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.decodeString("3[a]2[bc]"));
    }
}
