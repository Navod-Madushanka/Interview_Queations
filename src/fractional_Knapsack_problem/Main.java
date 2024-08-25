package fractional_Knapsack_problem;

import java.util.Arrays;

public class Main {

    public static void fractionalKnapsack(int capacity, Item[] items){
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.getWeightValueRatio(), a.getWeightValueRatio()));

        double totalWeight = 0;

        for(Item item : items){
            if(capacity > item.getWeight()){
                capacity -= item.getWeight();
                totalWeight += item.getValue();
            }else{
                totalWeight += item.getValue() * ((double) capacity / item.getWeight());
                break;
            }
        }
        System.out.println("Total weight is " + totalWeight);
    }

    public static void main(String[] args) {
        Item[] items = new Item[] { new Item(60, 10), new Item(100, 20), new Item(120, 30) };
        fractionalKnapsack(60, items);
    }
}
