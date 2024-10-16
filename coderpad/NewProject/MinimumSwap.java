package gs.coderpad.NewProject;

import java.util.Arrays;

import java.util.*;

public class MinimumSwap {

    public static int minSwaps(int[] arr) {
        int n = arr.length;
        int[] arrPos = new int[n];

        // Store positions of elements in the array
        for (int i = 0; i < n; i++) {
            arrPos[i] = arr[i];
        }

        // Sort the array based on the values
        Arrays.sort(arrPos);

        // Create a map to store index positions of sorted values
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arrPos[i], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            // If already visited or already in the right place, skip
            if (visited[i] || indexMap.get(arr[i]) == i) {
                continue;
            }

            // Compute the size of the cycle
            int cycleSize = 0;
            int x = i;

            while (!visited[x]) {
                visited[x] = true;
                x = indexMap.get(arr[x]);
                cycleSize++;
            }

            // If cycleSize is greater than 1, add (cycleSize - 1) swaps
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        System.out.println("Minimum number of swaps required: " + minSwaps(arr));
    }
}
