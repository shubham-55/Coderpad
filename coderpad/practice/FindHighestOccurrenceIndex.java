package gs.coderpad.practice;
import java.util.*;

public class FindHighestOccurrenceIndex {
    public static void main(String[] args) {
        String str="aabbbbbcc";
        findHighestOccurrenceIndex(str);
    }
    public static void findHighestOccurrenceIndex(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println("Highest Occuring character = " +list.get(0).getKey());
        System.out.println("Number of occurrence = " + list.get(0).getValue());
        int index=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getKey()!=list.get(0).getKey()){
                index++;
            }
        }
        System.out.println("Index of occurrence = " + index);
    }
}
