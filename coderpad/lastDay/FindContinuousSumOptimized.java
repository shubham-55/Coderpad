package gs.coderpad.lastDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindContinuousSumOptimized {
    public static void main(String[] args) {
        int[] arr = {12, 7, 29, 6, 2, 11, 4, 8};
        int sum = 19;
        findContinuousSum(arr, sum);
    }

    public static void findContinuousSum(int[] arr, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>(); // To store cumulative sums and their indices
        int currentSum = 0;

        // Initialize the map with the cumulative sum of 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1); // Handle the case where a subarray starts from index 0

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i]; // Update the current cumulative sum

            // Check if there is a subarray (ending at i) which adds up to the desired sum
            if (map.containsKey(currentSum - sum)) {
                List<Integer> indices = map.get(currentSum - sum);
                for (int index : indices) {
                    List<Integer> subArray = new ArrayList<>();
                    for (int j = index + 1; j <= i; j++) {
                        subArray.add(arr[j]);
                    }
                    result.add(subArray); // Add the found subarray to the result
                }
            }

            // Add the current cumulative sum to the map
            map.putIfAbsent(currentSum, new ArrayList<>());
            map.get(currentSum).add(i); // Store the current index for the cumulative sum
        }

        System.out.println(result);
    }
}

