package neetcode.implementing_data_structures.linked_list;

import java.util.ArrayList;

public class LinkedList {

    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }
        Node current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertTail(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            size = 1;
        }else{
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
            size++;
        }
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false; // Index out of bounds
        }
        if (index == 0) {
            head = head.next; // Remove the head node
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next; // Remove the node at index i
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node current = head;
        while (current != null) {
            arr.add(current.value);  // Use add() instead of set()
            current = current.next;
        }
        return arr;
    }

    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
