package Leetcode_questions.array_string.q2;

public class Solution {

    public static String gcdOfStrings(String str1, String str2){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;

        while (i < str1.length() && i < str2.length()){
            if (str1.charAt(i) == str2.charAt(i)){
                if(stringBuilder.indexOf(String.valueOf(str1.charAt(i))) == -1){
                    stringBuilder.append(str1.charAt(i));
                }
            }else{
                break;
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("soiduwouq", "soibu"));
    }
}
