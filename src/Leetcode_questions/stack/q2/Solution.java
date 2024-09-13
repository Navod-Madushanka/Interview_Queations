package Leetcode_questions.stack.q2;


import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean exploded = false;

            // Handle negative asteroids that collide with the stack
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(stack.peek()) < Math.abs(asteroid)) {
                    // Top of the stack (right-moving) explodes
                    stack.pop();
                } else if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    // Both asteroids explode
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    // The current asteroid explodes
                    exploded = true;
                    break;
                }
            }

            if (!exploded) {
                // If the current asteroid didn't explode, push it to the stack
                stack.push(asteroid);
            }
        }

        // Convert stack to result array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] asteroids1 = {5, 10, -5};
        int[] result1 = solution.asteroidCollision(asteroids1);
        System.out.println(java.util.Arrays.toString(result1));  // Output: [5, 10]

        int[] asteroids2 = {8, -8};
        int[] result2 = solution.asteroidCollision(asteroids2);
        System.out.println(java.util.Arrays.toString(result2));  // Output: []

        int[] asteroids3 = {10, 2, -5};
        int[] result3 = solution.asteroidCollision(asteroids3);
        System.out.println(java.util.Arrays.toString(result3));  // Output: [10]

    }
}
