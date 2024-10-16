package gs.coderpad.arrays;

public class MissingNumber {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        findMissingNumber(arr);
    }
    public static void findMissingNumber(int[] arr){
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        int n= arr.length+1;
        int nSum=(n*(n+1))/2;
        System.out.println(sum);
        System.out.println(nSum);
        System.out.println(nSum-sum);
    }
}
