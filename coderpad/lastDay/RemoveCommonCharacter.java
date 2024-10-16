package gs.coderpad.lastDay;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveCommonCharacter {
    public static void main(String[] args) {
        String str= "apple";
        removeCommonCharacter(str);
    }
    public static void removeCommonCharacter(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder result= new StringBuilder();
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                result.append(entry.getKey());
            }
        }
        System.out.println(result);
    }
}
