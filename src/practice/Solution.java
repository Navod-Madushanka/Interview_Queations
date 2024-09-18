package practice;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n <= 0) return false;

        for(int i = 0; i < flowerbed.length; i++){
            boolean left = i == 0 || flowerbed[i-1] == 0;
            boolean right = i == flowerbed.length-1 || flowerbed[i+1] == 0;

            if(left && right && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
                if(n <= 0) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    }
}
