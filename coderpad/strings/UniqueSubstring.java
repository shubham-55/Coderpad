package gs.coderpad.strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstring {
    public static void main(String args[]){
        System.out.println(findUniqueSubstrings("aab", 2));
    }
    public static Set<String> findUniqueSubstrings(String str,Integer num){
        Set<String> uniqueSubstrings = new HashSet<>();
        for(int i=0;i<=str.length()-num;i++){
            StringBuilder str1=new StringBuilder();
            for(int j=0;j<num;j++) {
                str1.append(str.charAt(i+j));
            }
            uniqueSubstrings.add(str1.toString());
        }
        return uniqueSubstrings;
    }
}
