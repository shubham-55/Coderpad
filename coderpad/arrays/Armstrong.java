package gs.coderpad.arrays;

public class Armstrong {
    public static void main(String args[]){
        int n=371;
        findArmstrong(n);
    }
    public static void findArmstrong(int n){
        int x=n;
        int a=n;
        int count=0;
        int sum=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        while(x>0){
            int p=x%10;
            sum+=Math.pow(p,count);
            x=x/10;
        }
        if(sum==a){
            System.out.println(a + " is armstrong number");
        } else {
            System.out.println(a + " is not a armstrong number");
        }
    }
}
