package data_structures.stack.q1;

public class Main {
    public static void main(String[] args) {
        // Create stack directly using array of Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        Stack<Integer> intStack = new Stack<>(intArray);

        System.out.println("Top element in Integer stack: " + intStack.peek());

        // Create stack directly using array of String
        String[] stringArray = {"A", "B", "C", "D"};
        Stack<String> stringStack = new Stack<>(stringArray);

        System.out.println("Top element in String stack: " + stringStack.peek());
    }
}
