package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};
        findCommonSortedArray(arr1,arr2,arr3);
    }

    public static void findCommonSortedArray(int[] arr1,int[] arr2,int[] arr3) {
        List<Integer> list = new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                list.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i]<arr2[j]) {
                i++;
            } else if (arr2[j]<arr3[k]) {
                j++;
            } else{
                k++;
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
