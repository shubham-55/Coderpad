package gs.coderpad.NewProject;

import java.util.*;

public class MinimumSwaps {

    public static int minSwaps(int[] arr) {
        int n = arr.length;
        // Create a mapping of value to index
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[arr[i] - 1] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(pos));

        // To keep track of visited elements
        boolean[] visited = new boolean[n];
        int swaps = 0;

        // Traverse each element and calculate the number of swaps required
        for (int i = 0; i < n; i++) {
            if (visited[i] || pos[i] == i) {
                continue; // Skip if already visited or already in the correct place
            }

            // Compute the size of the cycle
            int cycleSize = 0;
            int x = i;

            while (!visited[x]) {
                visited[x] = true;
                x = pos[x];
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

