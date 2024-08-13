package recursion.tail_recurtion;

class GFG{
    static void fun(int n){
        if(n>0){
            System.out.print(n + " ");
            fun(n-1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int x = 3;
        GFG.fun(x);
    }
}
