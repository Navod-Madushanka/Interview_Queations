package longest_common_subsequence_algorithm;

public class Main {

    public static int lcs(String sequence1, String sequence2){
        int len1 = sequence1.length();
        int len2 = sequence2.length();

        int[][] dpTable = new int[len1 + 1][len2 + 1];

        // Corrected loop conditions
        for(int i = 1; i <= len1; i++){
            for(int j = 1; j <= len2; j++){
                if(sequence1.charAt(i - 1) == sequence2.charAt(j - 1)){
                    dpTable[i][j] = dpTable[i - 1][j - 1] + 1;
                }else{
                    dpTable[i][j] = Math.max(dpTable[i - 1][j], dpTable[i][j - 1]);
                }
            }
        }
        return dpTable[len1][len2];
    }


    public static void main(String[] args) {
        System.out.println("Length of LCS: "+ lcs("AGGTAB", "GXTXAYB"));
    }
}
