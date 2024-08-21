package merge_sort.q1;

public class GFG {
    static void merge(int array[], int leftIndex, int middleIndex, int rightIndex) {
        // Find sizes of two subarrays to be merged
        int leftSubarraySize = middleIndex - leftIndex + 1;
        int rightSubarraySize = rightIndex - middleIndex;

        // Create temporary arrays
        int leftSubarray[] = new int[leftSubarraySize];
        int rightSubarray[] = new int[rightSubarraySize];

        // Copy data to temporary arrays
        for (int i = 0; i < leftSubarraySize; ++i)
            leftSubarray[i] = array[leftIndex + i];
        for (int j = 0; j < rightSubarraySize; ++j)
            rightSubarray[j] = array[middleIndex + 1 + j];

        // Merge the temporary arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int mergedIndex = leftIndex;
        while (i < leftSubarraySize && j < rightSubarraySize) {
            if (leftSubarray[i] <= rightSubarray[j]) {
                array[mergedIndex] = leftSubarray[i];
                i++;
            } else {
                array[mergedIndex] = rightSubarray[j];
                j++;
            }
            mergedIndex++;
        }

        // Copy remaining elements of leftSubarray[] if any
        while (i < leftSubarraySize) {
            array[mergedIndex] = leftSubarray[i];
            i++;
            mergedIndex++;
        }

        // Copy remaining elements of rightSubarray[] if any
        while (j < rightSubarraySize) {
            array[mergedIndex] = rightSubarray[j];
            j++;
            mergedIndex++;
        }
    }

    // Main function that sorts array[leftIndex..rightIndex] using merge()
    static void sort(int array[], int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            // Find the middle point
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

            // Sort first and second halves
            sort(array, leftIndex, middleIndex);
            sort(array, middleIndex + 1, rightIndex);

            // Merge the sorted halves
            merge(array, leftIndex, middleIndex, rightIndex);
        }
    }

    // A utility function to print array of size n
    static void printArray(int array[]) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        int array[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(array);

        sort(array, 0, array.length - 1);

        System.out.println("\nSorted array is");
        printArray(array);
    }
}
