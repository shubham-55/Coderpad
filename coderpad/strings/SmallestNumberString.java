package gs.coderpad.strings;

import java.util.Stack;

public class SmallestNumberString {
    public static void main(String[] args) {
       String num = "1432219";
       int k = 3;
       getSmallestNumber(num,k);
    }
    public static void getSmallestNumber(String num,int k){
        Stack<Character> stack = new Stack<>();
        for(char c:num.toCharArray()){
            if(stack.empty()){
                stack.push(c);
            }else if(k>0 && stack.peek()>c ){
                stack.pop();
                stack.push(c);
                k--;
            }else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse());
    }
}
