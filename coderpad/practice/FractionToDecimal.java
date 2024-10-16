package gs.coderpad.practice;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {
    public static void main(String[] args) {
        int numerator=50;
        int denominator=22;
        System.out.println(findDecimal(numerator,denominator));
    }
    public static String findDecimal(int num,int den){
        if(num==0){
            return "0";
        }
        StringBuilder result = new StringBuilder();
        if(num<0 ^ den<0){
            result.append("-");
        }
        long numerator=Math.abs((long)num);
        long denominator=Math.abs((long)den);

        long integralPart=numerator/denominator;
        result.append(integralPart);

        long remainder=numerator%denominator;
        if(remainder==0){
            return result.toString();
        }

        result.append(".");
        Map<Long,Integer> remainderMap=new HashMap<>();
        remainderMap.put(remainder,result.length());

        while(remainder !=0){
            remainder *=10;
            long decimalpart=remainder/denominator;
            result.append(decimalpart);
            remainder=remainder%denominator;

            if(remainderMap.containsKey(remainder)){
                int index=remainderMap.get(remainder);
                result.insert(index,"(");
                result.append(")");
                break;
            }else{
                remainderMap.put(remainder,result.length());
            }
        }

        return result.toString();
    }
}
