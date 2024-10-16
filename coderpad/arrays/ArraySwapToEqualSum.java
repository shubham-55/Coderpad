package gs.coderpad.arrays;

import java.util.*;

public class ArraySwapToEqualSum {
    public static List<int[]> findSwap(int[] arr1, int[] arr2) {
        int sum1 = 0, sum2 = 0;

        // Calculate the sum of both arrays
        for (int num : arr1) {
            sum1 += num;
        }
        for (int num : arr2) {
            sum2 += num;
        }

        // Calculate the difference
        int diff = sum1 - sum2;

        // If the difference is odd, there is no valid pair
        if (diff % 2 != 0) {
            return null; // No valid swap exists
        }

        // Create a set for the second array
        Set<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }
        List<int[]> validPairs = new ArrayList<>();
        // Look for a valid pair
        for (int x : arr1) {
            int y = x - diff / 2; // Calculate the required y
            if (set.contains(y)) {
                 validPairs.add(new int[]{x,y});
            }
        }

        return validPairs; // No valid swap found
    }

    public static void main(String[] args) {
        int[] arr1 ={5, 6, 4, 7};
        int[] arr2 = {1, 2, 3, 8};

        List<int[]> result = findSwap(arr1, arr2);
        if (result != null) {
            for(int[] x:result) {
                System.out.println(Arrays.toString(x));
            }
        } else {
            System.out.println("No valid swap found.");
        }
    }
}
