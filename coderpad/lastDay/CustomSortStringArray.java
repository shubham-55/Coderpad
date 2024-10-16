package gs.coderpad.lastDay;

import java.util.*;

public class CustomSortStringArray {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Ajay", "Raja", "Keshav", "List", "Set", "Elephant", "Drone");
        String order="TESARDLK";
        sortedArr(strings,order);
    }
    public static void sortedArr(List<String> strings,String order){
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int minLength= Math.min(o1.length(),o2.length());
                for(int i=0;i<minLength;i++){
                    char c1= o1.charAt(i);
                    char c2= o2.charAt(i);
                    int order1=map.getOrDefault(c1,Integer.MAX_VALUE);
                    int order2=map.getOrDefault(c2,Integer.MAX_VALUE);
                    if(order1!=order2) {
                        return Integer.compare(order1, order2);
                    }
                }
                return Integer.compare(o1.length(),o2.length());
            }
        });
        System.out.println(strings);
    }
}
