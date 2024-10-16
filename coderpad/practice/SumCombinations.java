package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.List;

public class SumCombinations {

    // Recursive method to find and print combinations
    public static void findCombinations(int target, int currentSum, int start, List<Integer> combination) {
        // Base case: If current sum equals target, print the combination
        if (currentSum == target) {
            System.out.println(combination);
            return;
        }

        // Iterate through possible numbers to add to the current combination
        for (int i = start; i <= target - currentSum; i++) {
            combination.add(i);
            findCombinations(target, currentSum + i, i, combination);
            combination.remove(combination.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        int n = 3; // Given number
        findCombinations(n, 0, 1, new ArrayList<>());
    }
}