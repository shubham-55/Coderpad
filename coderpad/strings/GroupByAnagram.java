package gs.coderpad.strings;

import java.util.*;

import static java.util.Arrays.asList;

public class GroupByAnagram {
    public static void main(String args[]) {
        List<String> list = asList("cat", "dog", "god","odg");
        groupByAnagram(list);
    }
    public static void groupByAnagram(List<String> list) {
        Set<Set<String>> finalList= new LinkedHashSet<>();
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            Set<String> list1=new LinkedHashSet<>();
            for (int j = i + 1; j < list.size(); j++) {
                if (isAnagram(list.get(i), list.get(j))){
                    list1.add(list.get(i));
                    list1.add(list.get(j));
                    count++;
                }else{
                    list1.add(list.get(i));
                    count++;
                }
            }
            if(!list1.isEmpty()) {
                finalList.add(list1);
            }
        }
        System.out.println(finalList);
        System.out.println(count);
    }

    public static boolean isAnagram (String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(char c: str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: str2.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(int value:map.values()){
            if(value !=0) {
                return false;
            }
        }
        return true;
    }
}
