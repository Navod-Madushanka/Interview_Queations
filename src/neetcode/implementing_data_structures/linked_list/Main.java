package neetcode.implementing_data_structures.linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Test 1: insertHead and getValues
        list.insertHead(1);
        list.insertTail(2);
        list.insertHead(0);
        System.out.println(list.getValues()); // Output: [0, 1, 2]

        // Test 2: remove a node
        list.remove(1);
        System.out.println(list.getValues()); // Output: [0, 2]

        // Test 3: get method
        System.out.println(list.get(0)); // Output: 0
        System.out.println(list.get(1)); // Output: 2
        System.out.println(list.get(2)); // Output: -1 (out of bounds)

        // Test 4: remove out-of-bounds index
        System.out.println(list.remove(5)); // Output: false

        // Test 5: insert more nodes and check values
        list.insertTail(3);
        list.insertHead(9);
        System.out.println(list.getValues()); // Output: [9, 0, 2, 3]
    }
}
