package gs.coderpad.strings;

import java.util.Arrays;
import java.util.Comparator;

import static gs.coderpad.strings.CheckSubstring.isSubstring;

public class LargetSubstring {
    public static void main(String args[]){
        String[] str={"padmaja", "wxzy", "maja"};
        findLargestSubstring(str);
    }
    public static void findLargestSubstring(String[] str){
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String length1=String.valueOf(o1.length());
                String length2=String.valueOf(o2.length());
                return length2.compareTo(length1);
            }
        });
        for(int i=0;i< str.length;i++) {
            System.out.println(str[i]);
        }
        for(int i =1;i< str.length;i++) {
            if(isSubstring(str[0], str[i])){
                System.out.println(str[i]+" is the longest substring of "+str[0]);
                break;
            }
        }
    }
}
