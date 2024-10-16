package gs.coderpad.arrays;

import java.util.*;

public class ConcatenateElements {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(6, 7, 4, 30);
        System.out.println(concatenateElements(list));
    }
    public static String concatenateElements(List<Integer> numbers) {
        // Convert the list of integers to a list of strings
        List<String> numberStrings = new ArrayList<>();
        for (Integer number : numbers) {
            numberStrings.add(String.valueOf(number));
        }

        // Sort the list using a custom comparator
        Collections.sort(numberStrings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated results
                //System.out.println(numberStrings);
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);// Sort in descending order
            }
        });
        System.out.println(numberStrings);

        // Edge case: if the largest number is "0", return "0"
        if (numberStrings.get(0).equals("0")) {
            return "0";
        }

        // Build the maximum number by concatenating the sorted strings
        StringBuilder result = new StringBuilder();
        for (String str : numberStrings) {
            result.append(str);
        }

        return result.toString();
    }
}
