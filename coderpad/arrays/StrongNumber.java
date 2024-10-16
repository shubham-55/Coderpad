package gs.coderpad.arrays;

public class StrongNumber {
    public static void main(String args[]){
        int n=145;
        findStrongNumber(n);
    }
    public static void findStrongNumber(int n){
        int fact=0;
        int x=n;
        while(n>0){
            int temp=n%10;
            fact=fact+factorial(temp);
            n=n/10;
        }
        if(fact==x){
            System.out.println(x +" is strong number");
        } else {
            System.out.println(n +" is not strong number");
        }
    }
    public static int factorial(int temp){
        int fact=0;
        if(temp==1 || temp==0){
            fact=1;
        }else{
            fact= temp*factorial(temp-1);
        }
        return fact;
    }
}
