package gs.coderpad.arrays;

public class PerfectNumber {
    public static void main(String args[]){
        int n=100;
        findPerfectNumber(n);
    }
    public static void findPerfectNumber(int n){

        for(int i=1;i<=n;i++){
            int sum=0;//6
            for(int j=1;j<=i/2;j++){ //1..3
                if(i%j==0){
                    sum +=j;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
