package gs.coderpad.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonRepeatingCharacter {
    public static void main(String args[]){
    String str="apple";
    printSecondNonRepeatingCharacter(str);
}
    public static void printSecondNonRepeatingCharacter(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=0;
        for(char c: str.toCharArray()){
            if(map.get(c)==1){
                count++;
            }
            if(count==2){
                System.out.println(c);
            }
        }
    }
}
