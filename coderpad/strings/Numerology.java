package gs.coderpad.strings;

public class Numerology {
    public static void main(String args[]){
        String str="MOUSHMI RANI";
        printNumerologySum(str);
    }
    public static void printNumerologySum(String str){
        int sum=0;
        for(char c: str.toCharArray()){
            if(c == 'A' || c == 'I' || c == 'J' || c == 'Q' || c == 'Y'){
                sum= sum+1;
            }else if(c == 'B' || c == 'K' || c == 'R'){
                sum= sum+2;
            }else if(c == 'C' || c == 'G' || c == 'L' || c == 'S'){
                sum= sum+3;
            }else if(c == 'D' || c == 'M' || c == 'T'){
                sum= sum+4;
            }else if(c == 'E' || c == 'H' || c == 'N' || c == 'X'){
                sum= sum+5;
            }else if(c == 'U' || c == 'V' || c == 'W' ){
                sum= sum+6;
            }else if(c == 'O' || c == 'Z' ){
                sum= sum+7;
            }else if(c == 'F' || c == 'P' ){
                sum= sum+8;
            }
        }
        int sum1 = 0, digit=0;
        if(sum>9){
            while (sum > 0) {
                digit = sum % 10;
                sum1 += digit;
                sum = sum / 10;
                if(sum1>9){
                    sum=sum1;
                    sum1=0;
                }
            }
        }
        System.out.println(sum1);
    }
}
