package gs.coderpad.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String args[]){
        String str="aaabbaa";
        printFrequency(str);
    }
    public static void printFrequency(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey().toString()+entry.getValue().toString());
        }
    }
}
