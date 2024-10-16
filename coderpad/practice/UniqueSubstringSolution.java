package gs.coderpad.practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstringSolution {
    public static void main(String[] args) {
        System.out.println(printUniqueSubstring("aab",2));
    }
    public static Set<String> printUniqueSubstring(String str,int n) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<=str.length()-n;i++){
            int j;
            StringBuilder sb=new StringBuilder();
            for(j=0;j<n;j++){
                sb.append(str.charAt(i+j));
            }
            set.add(sb.toString());
        }
        return set;
    }
}
