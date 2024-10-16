package gs.coderpad.practice;

import java.util.*;

public class SumSwap {
    public static void main(String[] args) {
        int[] arr1 = {2,5} ;
        int[] arr2 = {3,4};
        List<int[]> result = findSwapPair(arr1, arr2);
        if (result != null) {
            for(int[] x:result) {
                System.out.println(Arrays.toString(x));
            }
        } else {
            System.out.println("No valid swap found.");
        }
    }
    public static List<int[]> findSwapPair(int[] arr1,int[] arr2){
        int sum1 = 0, sum2 = 0;
        for (int num : arr1) {
            sum1 += num;
        }
        for (int num : arr2) {
            sum2 += num;
        }
        int diff = sum1 - sum2;
        if(diff==0){
            return null;
        }
        if (diff % 2 != 0) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }
        List<int[]> validPairs = new ArrayList<>();
        for (int x : arr1) {
            int y = x - diff / 2;
            if (set.contains(y)) {
                validPairs.add(new int[]{x,y});
            }
        }
        return validPairs;
    }
}

