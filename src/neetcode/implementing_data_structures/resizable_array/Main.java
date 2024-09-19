package neetcode.implementing_data_structures.resizable_array;

public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(1);

        // Initial array size and capacity
        System.out.println(array.getSize());       // Output: 0
        System.out.println(array.getCapacity());   // Output: 1

        // Add element and check capacity
        array.pushback(1);
        System.out.println(array.getCapacity());   // Output: 1

        // Add another element, causing the array to resize
        array.pushback(2);
        System.out.println(array.getCapacity());   // Output: 2

        // Get element at index 1
        System.out.println(array.get(1));          // Output: 2

        // Set element at index 1 to 3
        array.set(1, 3);
        System.out.println(array.get(1));          // Output: 3

        // Pop the last element and check size
        System.out.println(array.popback());       // Output: 3
        System.out.println(array.getSize());       // Output: 1

        // Final check of size and capacity
        System.out.println(array.getCapacity());   // Output: 2
    }
}
