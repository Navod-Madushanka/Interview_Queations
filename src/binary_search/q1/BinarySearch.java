package binary_search.q1;

public class BinarySearch {

    public static int binarySearchRecursive(int[] arr, int low, int high, int key){
        if(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                return binarySearchRecursive(arr, low, mid - 1, key);
            }else{
                return binarySearchRecursive(arr, mid + 1, high, key);
            }
        }
        return -1;
    }

    public static int binarySearchIteration(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int n = arr.length;
        int x = 12;

        int result1 = binarySearchIteration(arr, x);
        if(result1 == -1){
            System.out.println("Element not found in Iteration");
        }else{
            System.out.println("Element found at index Iteration " + result1);
        }

        int result2 = binarySearchRecursive(arr, 0, n - 1, x);
        if(result2 == -1){
            System.out.println("Element not found in Recursive");
        }else{
            System.out.println("Element found at index Recursive " + result2);
        }
    }
}
