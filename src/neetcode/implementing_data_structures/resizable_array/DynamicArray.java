package neetcode.implementing_data_structures.resizable_array;

public class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        if(capacity < 0){
            throw new IllegalArgumentException("Capacity must be a positive integer");
        }
        arr = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[i];
    }

    public void set(int i, int n) {
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            resize();
        }
        arr[size++] = n;
    }

    public int popback() {
        if(size == 0){
            throw new IllegalStateException("Array is empty");
        }
        return arr[--size];
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
