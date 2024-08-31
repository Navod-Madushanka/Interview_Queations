package data_structures.stack.q1.stack_using_queue;

public class Main {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());    // Output: 3
        System.out.println(stack.pop());    // Output: 3
        System.out.println(stack.top());    // Output: 2
        System.out.println(stack.pop());    // Output: 2
        System.out.println(stack.isEmpty()); // Output: false
        System.out.println(stack.pop());    // Output: 1
        System.out.println(stack.isEmpty()); // Output: true
    }
}
