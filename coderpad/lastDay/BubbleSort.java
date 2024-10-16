package gs.coderpad.lastDay;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        System.out.println(arr.length);
        for(int i=0;i< arr.length;i++){
            boolean swapped=false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
