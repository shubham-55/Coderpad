package gs.coderpad.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxUsingCollection {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10, 20, 30, 5, 15);
        findMax(list);
    }

    public static void findMax(List<Integer> list) {
        int maxValue=Collections.max(list);
        System.out.print(maxValue);
    }
}
