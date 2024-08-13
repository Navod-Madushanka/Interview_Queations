package parameter_passing;

public class CallByValue {
    static void modifyValue(int x){
        x = 20;
        System.out.println("Inside the Function: x = " + x);
    }

    public static void main(String[] args) {
        int a = 10;
        modifyValue(a);
        System.out.println("Inside the Caller: a = " + a);
    }
}
