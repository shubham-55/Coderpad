package gs.coderpad.practice;

public class AddFraction {
    public static void main(String[] args) {
        String num1="2/3";
        String num2="4/5";
        addFraction(num1,num2);
    }
    public static void addFraction(String n1, String n2){
        String[] str=n1.split("/");
        String[] str1=n2.split("/");
        int num1=Integer.parseInt(str[0]);
        int den1=Integer.parseInt(str[1]);
        int num2=Integer.parseInt(str1[0]);
        int den2=Integer.parseInt(str1[1]);

        int numerator= num1*den2+num2*den1;
        int denominator=den1*den2;
        int gcd = gcd(numerator,denominator);
        numerator /=gcd;
        denominator /=gcd;
        System.out.println(numerator +"/"+denominator);

    }
    public static int gcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
