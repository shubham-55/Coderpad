package gs.coderpad.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicalStairs {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int n=5;
        findWays(n,0,0,new ArrayList<Integer>(),result);
    }
    public static void findWays(int n, int currentStep, int lastJump, List<Integer> currentPath, List<List<Integer>> result) {
        if (currentStep == n) {
            result.add(new ArrayList<>(currentPath));
            return;
        }
        if (currentStep > n) {
            return;
        }
        if(lastJump==0){
            currentPath.add(1);
            findWays(n,currentStep+1,1,currentPath,result);
            currentPath.remove(currentPath.size()-1);

            currentPath.add(2);
            findWays(n,currentStep+2,2,currentPath,result);
            currentPath.remove(currentPath.size()-1);

        } else {
            currentPath.add(lastJump);
            findWays(n,currentStep+lastJump,lastJump,currentPath,result);
            currentPath.remove(currentPath.size()-1);

            currentPath.add(lastJump+1);
            findWays(n,currentStep+lastJump+1,lastJump+1,currentPath,result);
            currentPath.remove(currentPath.size()-1);

            currentPath.add(lastJump+2);
            findWays(n,currentStep+lastJump+2,lastJump+2,currentPath,result);
            currentPath.remove(currentPath.size()-1);
        }
        for(List<Integer> x:result) {
            System.out.println(result);
        }
        System.out.println(result.size());
    }
}
