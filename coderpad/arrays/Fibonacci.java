package gs.coderpad.arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n=12;
        fibonacci(n);
    }
    public static void fibonacci(int n){
        int first=0,second=1,next;
        for(int i=0;i<n;i++){
            System.out.print(first + " ");
            next=first+second;
            first=second;
            second=next;
        }
    }
}
