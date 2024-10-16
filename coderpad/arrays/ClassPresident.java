package gs.coderpad.arrays;

import java.util.LinkedList;
import java.util.List;

public class ClassPresident {
    public static void main(String args[]){
//        int[][] testCases = {
//                {1, 1, 1},
//                {2, 2, 1},
//                {5, 3, 4},
//                {4, 2, 1},
//                {100, 2, 73},
//                {6, 4, 5},
//                {1000, 5, 763}
//        };
        int[][] testCases ={{5, 3, 4}};

        for (int[] testCase : testCases) {
            int n = testCase[0];
            int k = testCase[1];
            int expected = testCase[2];
            int result = findClassPresident(n, k);
            System.out.printf("findPresident(%d, %d) = %d; Expected = %d; %s%n", n, k, result, expected, (result == expected ? "PASS" : "FAIL"));
        }

    }
    public static int findClassPresident(int n,int k){
       int position=0;
        for (int i = 1; i <= n; i++) {
           position = (position + k) % i;// Update position based on the current number of students
        }
       return position+1;
    }
}

