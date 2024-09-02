package merge_sort.q1.p1;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] arr) {
        if(arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr ,leftHalf, rightHalf);
    }

    private void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;

        while(i < leftHalf.length && j < rightHalf.length) {
            if(leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            }else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalf.length) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightHalf.length) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public void printArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
