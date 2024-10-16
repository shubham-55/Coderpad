package gs.coderpad.arrays;

import java.util.Arrays;

public class PositiveNegativeArray {
    public static void main(String[] args) {
        int [] arr={3,-2,1,-1,4,9,-6};
        segregatePositiveNegative(arr);
    }
    public static void segregatePositiveNegative(int [] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            while (left < right && arr[left] < 0) {
                left++;
            }
            while (left < right && arr[right] >= 0) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
