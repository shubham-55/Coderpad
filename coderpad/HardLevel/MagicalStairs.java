package gs.coderpad.HardLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MagicalStairs {

    public static void main(String[] args) {
        int n = -1; // The step number to reach
        List<List<Integer>> results = new ArrayList<>();
        findAllWays(n, 0, 0, new ArrayList<>(), results);
        if(results.size() !=0) {
            System.out.println("All possible ways to reach step " + n + ":");
            for (List<Integer> way : results) {
                System.out.println(way);
            }
        }
    }

    private static void findAllWays(int target, int currentStep, int lastJump, List<Integer> currentPath, List<List<Integer>> results) {

        if(target<0){
            System.out.println("Invalid Input");
        }

        if (currentStep == target) {
            results.add(new ArrayList<>(currentPath));
            return;
        }
        if (currentStep > target && target>0) {
            return;
        }

        int startJump = (lastJump == 0) ? 1 : lastJump;

        for (int jump = startJump; jump <= target - currentStep; jump++) {
            currentPath.add(jump);
            findAllWays(target, currentStep + jump, jump, currentPath, results);
            currentPath.remove(currentPath.size() - 1); // Backtrack
        }
    }
}
