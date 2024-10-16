package gs.coderpad.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedWord {
    public static void main(String args[]){
        String str="Sunset is the time of day when our sky meets the outer space solar winds." +
                "There are blue, pink, and purple swirls, spinning and twisting, like clouds of balloons caught in a whirlwind. The sun moves slowly to hide behind the line of horizon, while the moon races to take its place in prominence atop the night sky. People slow to a crawl, entranced, fully forgetting the deeds that must still be done. There is a coolness, a calmness, when the sun does set.";
        findRepeatedWord(str);
    }
    public static void findRepeatedWord(String str){
        Map<String,Integer> map = new LinkedHashMap<>();
        String[] strArr = str.split(" ");
        for(String c: strArr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()!=1){
                System.out.println(entry.getKey() +"->" +  entry.getValue());
            }
        }
    }
}
