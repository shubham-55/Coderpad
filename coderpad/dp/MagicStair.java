package gs.coderpad.dp;

import java.util.ArrayList;
import java.util.List;

public class MagicStair {

    public static void main(String[] args) {
        int n = 5; // Change this value to test with different step counts
        List<List<Integer>> result = new ArrayList<>();
        findWays(n, 0, 0, new ArrayList<>(), result);
        printResult(result);
    }

    public static void findWays(int n, int currentStep, int lastJump, List<Integer> currentPath, List<List<Integer>> result) {
        // Base case: if we reach exactly the nth step
        if (currentStep == n) {
            result.add(new ArrayList<>(currentPath));
            return;
        }

        // If the current step exceeds n, return
        if (currentStep > n) {
            return;
        }

        // Determine the next jump size
        if (lastJump == 0) {
            // First jump can be 1 or 2
            currentPath.add(1);
            findWays(n, currentStep + 1, 1, currentPath, result); // Jump 1
            currentPath.remove(currentPath.size() - 1);

            currentPath.add(2);
            findWays(n, currentStep + 2, 2, currentPath, result); // Jump 2
            currentPath.remove(currentPath.size() - 1);
        } else {
            // Subsequent jumps can be the same, +1 or +2 of the last jump
            currentPath.add(lastJump);
            findWays(n, currentStep + lastJump, lastJump, currentPath, result); // Jump x
            currentPath.remove(currentPath.size() - 1);

            currentPath.add(lastJump + 1);
            findWays(n, currentStep + lastJump + 1, lastJump + 1, currentPath, result); // Jump x + 1
            currentPath.remove(currentPath.size() - 1);

            currentPath.add(lastJump + 2);
            findWays(n, currentStep + lastJump + 2, lastJump + 2, currentPath, result); // Jump x + 2
            currentPath.remove(currentPath.size() - 1);
        }
    }

    public static void printResult(List<List<Integer>> result) {
        if (result.isEmpty()) {
            System.out.println("No valid paths found.");
        } else {
            System.out.println("All possible paths to reach the nth step:");
            for (List<Integer> path : result) {
                System.out.println(path);
            }
        }
        System.out.println();
    }
}
