package merge_sort.q1;

public class MergeSortInPlaceDemo {
    static void mergeInPlace(int array[], int left, int middle, int right) {
        int start2 = middle + 1;

        // If the direct merge is already sorted
        if (array[middle] <= array[start2]) {
            return;
        }

        // Two pointers to maintain start of both arrays to merge
        while (left <= middle && start2 <= right) {

            // If the element is already in the right place
            if (array[left] <= array[start2]) {
                left++;
            } else {
                int value = array[start2];
                int index = start2;

                // Shift all the elements between `left` and `start2` right by 1.
                while (index != left) {
                    array[index] = array[index - 1];
                    index--;
                }
                array[left] = value;

                // Update all pointers
                left++;
                middle++;
                start2++;
            }
        }
    }

    static void mergeSortInPlace(int array[], int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSortInPlace(array, left, middle);
            mergeSortInPlace(array, middle + 1, right);

            mergeInPlace(array, left, middle, right);
        }
    }


}
