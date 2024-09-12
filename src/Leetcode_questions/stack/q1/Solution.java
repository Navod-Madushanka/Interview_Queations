package Leetcode_questions.stack.q1;

import java.util.Stack;

public class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder newString = new StringBuilder();
        while (!stack.isEmpty()) {
            newString.append(stack.pop());
        }
        return newString.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeStars("leet**cod*e"));
    }
}
