package gs.coderpad.strings;

import java.util.*;

public class TopOccurrenceDescending {
    public static void main(String args[]){
        String str="Sunset is the time of day when our sky meets the outer space solar winds. There are blue, pink, and purple swirls, spinning and twisting, like clouds of balloons caught in a whirlwind. The sun moves slowly to hide behind the line of horizon, while the moon races to take its place in prominence atop the night sky. People slow to a crawl, entranced, fully forgetting the deeds that must still be done. There is a coolness, a calmness, when the sun does set.";
        printTopOccurrenceDescending(str);
    }
    public static void printTopOccurrenceDescending(String str){
        String[] str1= str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String s: str1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(new MyComparator());
        for (int i = 0; i < Math.min(10, sortedList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedList.get(i);
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
//        Collections.sort(sortedList, new Comparator<Map.Entry<String,Integer>>() {
//
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });

    }
}
