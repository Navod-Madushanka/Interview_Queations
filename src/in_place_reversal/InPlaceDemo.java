package in_place_reversal;

public class InPlaceDemo {

    static void print(Object[] obj){
        for(Object n : obj){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
//        In place using temp variable
        Integer[] n = {10, 20, 30, 40, 50};
        print(n);
        for(int i = 0; i < n.length/2; i++){
            int temp = n[i];
            n[i] = n[n.length-1-i];
            n[n.length-1-i] = temp;
        }
        print(n);

        String name = "Navod";
        char[] chars = name.toCharArray();

        for(int i = 0; i < chars.length/2; i++){
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }

    }
}
