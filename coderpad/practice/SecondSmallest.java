package gs.coderpad.practice;

public class SecondSmallest {

    public static void main(String args[]){
        int[] arr = {5,3,7,10,28};
        System.out.println("Second Smallest :"+secondSmallestNumber(arr));
    }
    public static int secondSmallestNumber(int[] arr){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]<secondSmallest && smallest!=arr[i]) {
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
}
