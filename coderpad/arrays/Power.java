package gs.coderpad.arrays;

public class Power {
    public static void main(String args[]){
        int num=10;
        int num1=2;
        System.out.println(checkPower(num,num1));
    }
    public static boolean checkPower(int num,int num1){
        if(num==1){
            return true;
        }
        if(num==0 || num%num1 !=0){
            return false;
        }
        return checkPower(num/num1,num1);
    }
}
