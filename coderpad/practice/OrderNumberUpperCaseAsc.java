package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderNumberUpperCaseAsc {

    public static void main(String[] args) {
        String[] strArr={"1","A","B","C","2","3","F","V","5"};
        findOrder(strArr);
    }
    public static void findOrder(String[] strArr){
        List<String> numbers = new ArrayList<>();
        List<String> letters = new ArrayList<>();
        for(String s: strArr){
            if(s.matches("\\d+")){
                numbers.add(s);
            }else{
                letters.add(s);
            }
        }
        Collections.sort(numbers);
        Collections.sort(letters);
        List<String> sortedList = new ArrayList<>();
        sortedList.addAll(numbers);
        sortedList.addAll(letters);
        String[] output = sortedList.toArray(new String[0]);
        System.out.println(Arrays.toString(output));
    }
}
