package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<Boolean>();

        int maxCandies = candies[0];

        for(int candy : candies){
            if(candy > maxCandies){
                maxCandies = candy;
            }
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i]+extraCandies >= maxCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies = {2,3,5,1,3};
        System.out.println(solution.kidsWithCandies(candies, 3));
    }
}
