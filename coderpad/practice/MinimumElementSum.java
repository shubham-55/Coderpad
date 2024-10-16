package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumElementSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        // Test cases
        System.out.println(minimumElements(array, 4));  // Expected output: 2+4=6
        System.out.println(minimumElements(array, 12)); // Expected output: -1
    }

    public static String minimumElements(int[] array, int target) {
        // Sort the array in ascending order
        Arrays.sort(array);
        List<Integer> elements = new ArrayList<>();
        int sum = 0;

        // Start from the largest element and add to the sum
        for (int i = array.length - 1; i >= 0; i--) {
            if (sum + array[i] <= target) {
                sum += array[i];
                elements.add(array[i]); // Add the element to the list
            }
            // If we have reached the target, we can stop
            if (sum == target) {
                break;
            }
        }

        // Check if we reached the target
        if (sum == target) {
            // Prepare the output in the desired format
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < elements.size(); i++) {
                result.append(elements.get(i));
                if (i < elements.size() - 1) {
                    result.append("+");
                }
            }
            result.append("=").append(target);
            return result.toString(); // Return the formatted string
        }

        return "-1"; // Return -1 if target cannot be reached
    }
}
