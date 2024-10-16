package gs.coderpad.practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};
        findUniqueSortedArray(arr1,arr2,arr3);
    }

    public static void findUniqueSortedArray(int[] arr1,int[] arr2,int[] arr3) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();
        for(Integer i: arr1){
            set.add(i);
        }
        for(Integer i: arr2) {
            if(!set.add(i)){
                commonElements.add(i);
            }
        }
        for(Integer i: arr3){
            if(!commonElements.add(i)){
                System.out.println(i);
            }
        }

    }
}
