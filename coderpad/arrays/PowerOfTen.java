package gs.coderpad.arrays;

public class PowerOfTen {
    public static void main(String[] args) {
        int num=100;
        int n=5;
        System.out.println(isPowerOfTen(num,n));
    }

    public static boolean isPowerOfTen(int num,int n) {
        if(num<=0){
            return false;
        }
        if(num==1){
            return true;
        }
        if(num%n !=0){
            return false;
        }
        return isPowerOfTen(num/n,n);
    }
}
