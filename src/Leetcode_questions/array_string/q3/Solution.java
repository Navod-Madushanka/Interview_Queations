package Leetcode_questions.array_string.q3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();

        // Find the current maximum candies any kid has
        int currentMax = candies[0];
        for (int candy : candies) {
            if (candy > currentMax) {
                currentMax = candy;
            }
        }

        // Check for each kid if they will have the greatest number of candies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= currentMax) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }
}
