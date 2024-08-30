package Leetcode_questions.array_string.q2;

public class Solution {

    public static int gdc(int a, int b) {
        if(b == 0){
            return a;
        }
        return gdc(b, a % b);
    }

    public static String gcdOfStrings(String str1, String str2){
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int gdcLength = gdc(str1.length(), str2.length());

        return str1.substring(0, gdcLength);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
    }
}
