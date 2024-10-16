package gs.coderpad.lastDay;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstring {
    public static void main(String[] args) {
        findUniqueSubStrings("aab",2);
    }
    public static void findUniqueSubStrings(String s,int n){
        if(s.length()<n){
            System.out.println("No substring");
        }
        Set<String> set = new HashSet<>();
        for(int i=0;i<=s.length()-n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(s.charAt(i+j));
            }
            set.add(sb.toString());
        }
        System.out.println(set);
    }
}
