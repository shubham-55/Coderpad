package gs.coderpad;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonRepeating {
    public static void main(String[] args) {
        String a ="apple";
        printSecondNonRepeatingChar(a);
    }
    public static void printSecondNonRepeatingChar(String str){
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
        int count=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                count++;
            }
            if(count==2){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
