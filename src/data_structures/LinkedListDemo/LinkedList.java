package data_structures.LinkedListDemo;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

//    remove
    public Node remove(int index){
        if(index < 0 || index > size){
            return null;
        }else if(index == 0){
            return removeFirst();
        }else if(index == size){
            return removeLast();
        }else{
            Node pre = get(index - 1);
            Node temp = pre.next;

            pre.next = temp.next;
            temp.next = null;
            size--;
            return temp;
        }
    }

//    inset
    public boolean insert(int index, int value){
        if(index < 0 || index > size){
            return false;
        }else if(index == 0){
            prepend(value);
            return true;
        }else if(index == size){
            append(value);
            return true;
        }else{
            Node node = new Node(value);
            Node temp = get(index - 1);
            node.next = temp.next;
         temp.next = node;
            size++;
            return true;
        }
    }

//    set
    public boolean set(int index ,int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

//    get
    public Node get(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

//    RemoveFirst
    public Node removeFirst(){
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        if(size == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

//    prepend
    public void prepend(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

//    RemoveLast
    public Node removeLast(){
        if(head == null){
            return null;
        }
        Node temp = head;
        Node pre = head;

        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        size--;

        if(size == 0){
            head = null;
            tail = null;
        }

        return temp;
    }


//    Append
    public void append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

//    PrintList
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
}
