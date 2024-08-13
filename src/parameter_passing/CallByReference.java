package parameter_passing;

public class CallByReference {
    static void modifyArray(int[] arr){
        arr[0] = 20;
        System.out.println("Inside the Function: arr[0] = " + arr[0]);
    }

    public static void main(String[] args) {
        int[] myArray = {10, 30, 50};

        // Passing the reference to the array
        modifyArray(myArray);

        System.out.println("Inside the Caller: myArray[0] = " + myArray[0]);
    }
}
