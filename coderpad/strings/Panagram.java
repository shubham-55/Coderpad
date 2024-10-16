package gs.coderpad.strings;

import java.util.Locale;

public class Panagram {
    public static void main (String args[]){
        String str="The quick brown fox jumps over the lazy og ";
        System.out.println(isPanagram(str));
        char[] chars = missingCharcter(str);
        for(char c : chars){
            if(c != '\0')
            System.out.println(c);
        }
    }
    public static boolean isPanagram(String str){
        str =str.toLowerCase();
        for(char ch='a'; ch <='z';ch++){
            if(!str.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }

    public static char[] missingCharcter(String str){
        str =str.toLowerCase();
        char [] charArr = new char[26];
        int i=0;
        for(char ch='a'; ch <='z';ch++){
            if(!str.contains(String.valueOf(ch))){
                charArr[i++] = ch;
            }
        }
        return charArr;

    }
}
