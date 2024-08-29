package bubble_sort.main;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;

        // Traverse through all elements in the array
        for (int i = 0; i < n; i++) {
            // Track if any swap is made during this pass
            boolean swapped = false;

            // Last i elements are already in place, so skip them
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swap is made, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        return arr;
    }
}
