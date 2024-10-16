package gs.coderpad.practice;

public class FractionToDecimalForm {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(4, 333));
    }
    public static String fractionToDecimal(int num,int den){
        if(num==0){
            return "0";
        }
        StringBuilder result = new StringBuilder();
        if((num<0) ^ (den<0)){
            result.append("-");
        }
        long numerator = Math.abs((long) num);
        long denominator = Math.abs((long) den);
        long integralPart=num/den;
        result.append(integralPart);
        long remainder=num%den;
        if(remainder==0){
            return result.toString();
        }
        result.append(".");
        return "";
    }
}
