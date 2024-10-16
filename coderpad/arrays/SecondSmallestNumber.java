package gs.coderpad.arrays;

public class SecondSmallestNumber {
    public static void main(String args[]){
        int[] arr = {5,3,7,10,28};
        System.out.println("Second Smallest :"+secondSmallestNumber(arr));
    }
    public static int secondSmallestNumber(int[] arr){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i =0;i< arr.length;i++){
            if(arr[i]<smallest) {
                secondSmallest=smallest;
                smallest = arr[i];
            }else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println("Smallest " + smallest);
        return secondSmallest;
    }
}
