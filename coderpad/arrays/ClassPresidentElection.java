package gs.coderpad.arrays;

import java.util.LinkedList;

public class ClassPresidentElection {

    public static int whoIsElected(int n, int k) {
        // Create a linked list of students numbered from 1 to n
        LinkedList<Integer> students = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            students.add(i);
        }

        int index = 0; // Start at the first student

        // Continue until only one student remains
        while (students.size() > 1) {
            // Find the index of the student to be removed
            index = (index + k - 1) % students.size(); // Move k-1 steps
            students.remove(index); // Remove that student
        }

        // Return the last remaining student's number
        return students.get(0);
    }

    public static boolean doTestsPass() {
        int[][] testCases = {
                {1, 1, 1},
                {2, 2, 1},
                {4, 2, 1},
                {100, 2, 73},
        };

        for (int[] testCase : testCases) {
            int answer = whoIsElected(testCase[0], testCase[1]);
            if (answer != testCase[2]) {
                System.out.println("Test failed!");
                System.out.printf("n:%d, k:%d, answer got: %d, should be: %d\n", testCase[0], testCase[1], answer, testCase[2]);
                return false;
            }
        }
        System.out.println("All tests passed");
        return true;
    }

    public static void main(String args[]) {
        doTestsPass();
    }
}

