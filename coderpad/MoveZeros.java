package gs.coderpad;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 3, 10, 0, 47, 0, 17,19 };
        moveZeros(arr);
    }
    public static void moveZeros(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]==0){
                int temp= arr[start];
                arr[start]= arr[end];
                arr[end]=temp;
                end--;
            }else{
                start++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
