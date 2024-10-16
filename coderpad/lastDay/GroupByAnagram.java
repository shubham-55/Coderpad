package gs.coderpad.lastDay;

import java.util.*;

public class GroupByAnagram {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("cat","dog","god","mouse","odg");
        findAnagramGroup(str);
    }
    public static void findAnagramGroup(List<String> str){
        Map<String,List<String>> map= new HashMap<>();
        for(String word: str){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String signature= new String(chars);
            map.putIfAbsent(signature,new ArrayList<>());
            map.get(signature).add(word);
        }
        Set<Set<String>> result= new LinkedHashSet<>();
        for(List<String> l : map.values()){
            Set<String> set = new LinkedHashSet<>();
            for(String s: l){
                set.add(s);
            }
            result.add(set);
        }
        System.out.println(result);
    }
}
