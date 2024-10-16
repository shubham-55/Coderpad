package gs.coderpad.arrays;

public class ArmstromgNumberBetween1000 {
    public static void main(String args[]){
        int n=1000;
        findArmstrong(n);
    }
    public static void findArmstrong(int n){
        for(int i=1;i<=n;i++) {
            int x = i;
            int b=i;
            int a=i;
            int count = 0;
            int sum = 0;
            while (b > 0) {
                b = b / 10;
                count++;
            }
            //System.out.println(count);
            while (x > 0) {
                int p = x % 10;
                sum += Math.pow(p, count);
                x = x / 10;
            }
            if (sum == i) {
                System.out.println(i + " is armstrong number");
            }
        }
    }
}
