package fibonacci_sequence;

public class Fibonacci {
    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int prev1 = 1; // F(n-1)
        int prev2 = 0; // F(n-2)
        int current = 0;

        for(int i = 2; i <= n; i++) {
            current = prev1 + prev2; // F(n) = F(n-1) + F(n-2)
            prev2 = prev1;  // Update F(n-2)
            prev1 = current; // Update F(n-1)
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
