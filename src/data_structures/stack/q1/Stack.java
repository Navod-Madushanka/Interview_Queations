package data_structures.stack.q1;

public class Stack<T> {
    private int maxSize;
    private T[] stackArray;
    private int top;

    // Constructor to initialize the stack with a specific size
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        maxSize = size;
        stackArray = (T[]) new Object[maxSize];  // Create a generic array
        top = -1;  // Stack is initially empty
    }

    // Constructor to initialize the stack from an array
    public Stack(T[] array) {
        this(array.length);
        createStackUsingArray(array);
    }

    // Push operation to add an element to the stack
    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    // Pop operation to remove and return the top element
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;  // Return null or throw an exception
        }
        return stackArray[top--];
    }

    // Peek operation to view the top element without removing it
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;  // Return null or throw an exception
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to create a stack from an array of any data type
    private void createStackUsingArray(T[] array) {
        for (T element : array) {
            this.push(element);
        }
    }
}

