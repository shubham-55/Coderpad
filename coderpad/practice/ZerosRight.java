package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ZerosRight {
    public static void main(String[] args) {
        int[] arr= {0,1,0,3,12};
        shiftZerosToRight(arr);
    }
    public static void shiftZerosToRight(int[] arr){
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i= index;i< arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
