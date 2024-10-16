package gs.coderpad.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        moveZeros(arr);
    }

    public static void moveZeros(int[] arr) {
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]==0){
                arr[left]=arr[right];
                arr[right]=0;
                left++;
                right--;
            } else{
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
