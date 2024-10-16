package gs.coderpad.arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String args[]){
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8};
        mergeSortedArray(arr1,arr2);
    }
    public static void mergeSortedArray(int[] arr1,int[] arr2){
        int l1=arr1.length;
        int l2=arr2.length;
        int[] mergedArray = new int[l1 + l2];

        int i = 0, j = 0, k = 0;
        while (i < l1 && j < l2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while (i < l1) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < l2) {
            mergedArray[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(mergedArray));
    }

}

