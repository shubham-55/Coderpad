package gs.coderpad.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class WeightOfGivenString {
    public static void main(String args[]){
        String str= "Apple";
        System.out.println(getWeight(str));
    }
    public static int getWeight(String str){
        str=str.toLowerCase();
//        char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'
//                         'v','w','x','y','z'};
//        for(char c: str.toCharArray()){
//
//        }
        Map<Character,Integer> map = new LinkedHashMap<>();
        int i=1;
        int sum=0;
        for(char c='a';c<='z';c++){
            map.put(c,i++);
        }
        for(char c: str.toCharArray()){
            sum=sum+map.get(c);
        }
        return sum;
    }
}
