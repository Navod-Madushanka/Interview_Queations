package merge_sort.q1.p1;

public class Main {
    public static void main(String[] args) {
        int array[] = { 12, 11, 13, 5, 6, 7 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.printArray(array);
        mergeSort.mergeSort(array);
        mergeSort.printArray(array);
    }
}
