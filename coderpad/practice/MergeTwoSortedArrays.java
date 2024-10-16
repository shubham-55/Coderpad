package gs.coderpad.practice;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String args[]){
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8};
        mergeSortedArray(arr1,arr2);
    }
    public static void mergeSortedArray(int[] arr1,int[] arr2){
        int l1=arr1.length;
        int l2=arr2.length;
        int[] mergedArr= new int[l1+l2];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2){
            if(arr1[i]<arr2[j]){
                mergedArr[k]=arr1[i];
                i++;
                k++;
            }else{
                mergedArr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<l1){
            mergedArr[k++]=arr1[i++];
        }
        while(j<l2){
            mergedArr[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(mergedArr));
    }
}
