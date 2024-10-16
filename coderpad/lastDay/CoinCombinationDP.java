package gs.coderpad.lastDay;

import java.util.ArrayList;
import java.util.List;

public class CoinCombinationDP {
    private static List<String> results = new ArrayList<>(); // Store all valid combinations

    public static void main(String[] args) {
        // Coin values and their limits
        int[] coins = {10, 2, 5}; // Coin values
        int[] limits = {5, 10, 50}; // Limits for each coin type
        int target = 50; // Target amount

        // Find combinations
        findCombinations(coins, limits, target, new int[3], 0);

        // Print all possible combinations
        System.out.println("All possible ways to make " + target + " rupees:");
        for (String combination : results) {
            System.out.println(combination);
        }
    }

    public static void findCombinations(int[] coins, int[] limits, int target, int[] count, int index) {
        // Base case: if the target is exactly 0, we found a valid combination
        if (target == 0) {
            StringBuilder combination = new StringBuilder();
            for (int i = 0; i < count.length; i++) {
                if (count[i] > 0) {
                    combination.append(coins[i]).append(" * ").append(count[i]).append(", ");
                }
            }
            // Remove the last comma and space
            results.add(combination.toString().substring(0, combination.length() - 2));
            return;
        }

        // If the target becomes negative or we exceed the number of coin types, return
        if (target < 0 || index >= coins.length) {
            return;
        }

        // Try using from 0 to the limit of the current coin
        for (int i = 0; i <= limits[index]; i++) {
            // Update count of the current coin type
            count[index] = i;
            // Call recursively for the next coin type
            findCombinations(coins, limits, target - coins[index] * i, count, index + 1);
        }
    }
}
