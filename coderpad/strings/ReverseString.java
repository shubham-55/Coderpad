package gs.coderpad.strings;

import java.util.Stack;

public class ReverseString {
    public static void main(String args[]){
        String str="I am Java Developer";
        reverseString(str);
        reverseStringWithoutExtraMem(str);
    }
    public static void reverseString(String str){
        Stack<Character> s = new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        //sb.delete(0, str.length());
        while(!s.empty()){
            sb.append(s.peek());
            s.pop();
        }
        System.out.println(sb.toString());
    }
    public static void reverseStringWithoutExtraMem(String str){
        int start=0;
        int end=str.length()-1;
        char[] charArr=str.toCharArray();
        while(end>start){
            char temp=str.charAt(start);
            charArr[start]=str.charAt(end);
            charArr[end]=temp;
            end--;
            start++;
        }
        System.out.println(String.valueOf(charArr));

    }
}
