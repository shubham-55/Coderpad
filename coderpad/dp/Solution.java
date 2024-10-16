package gs.coderpad.dp;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int target = 3; // Example target number
        List<List<Integer>> results = new ArrayList<>();
        findCombinations(target, new ArrayList<>(), results);

        // Print results
        System.out.println("Possible combinations to sum up to " + target + ":");
        for (List<Integer> combination : results) {
            System.out.println(String.join("+", combination.stream().map(String::valueOf).toArray(String[]::new)));
        }
    }

    private static void findCombinations(int remaining, List<Integer> currentCombination, List<List<Integer>> results) {
        if (remaining == 0) {
            results.add(new ArrayList<>(currentCombination));
            return;
        }
        if (remaining < 0) {
            return;
        }

        // Try taking 1 step
        currentCombination.add(1);
        findCombinations(remaining - 1, currentCombination, results);
        currentCombination.remove(currentCombination.size() - 1);

        // Try taking 2 steps
        currentCombination.add(2);
        findCombinations(remaining - 2, currentCombination, results);
        currentCombination.remove(currentCombination.size() - 1);
    }
}
