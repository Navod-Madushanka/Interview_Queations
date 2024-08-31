package data_structures.stack.q1.stack_using_queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.add(x);

        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        Queue<Integer> temp = queue1;

        queue1 = queue2;
        queue2 = temp;
    }

    public int pop(){
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.remove();
    }

    public int top(){
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.peek();
    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }

}
