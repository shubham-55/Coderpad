package gs.coderpad.strings;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String args[]){
        String str="Good day day bye bye";
        removeDuplicate(str);
    }
    public static void removeDuplicate(String str){
        String [] str1= str.split(" ");
        Set<String> set = new LinkedHashSet<>();
        for( String s: str1){
            set.add(s);
        }
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next()+" ");
//        }
        for(String s: set){
            System.out.print(s+" ");
        }

    }
}
