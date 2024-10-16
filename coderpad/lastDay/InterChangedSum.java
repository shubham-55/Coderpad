package gs.coderpad.lastDay;

import java.util.HashSet;
import java.util.Set;

public class InterChangedSum {
    public static void main(String[] args) {
        int[] arr2={1,2,3,9};
        int[] arr1={5,6,4,7,1};
        findValidPairs(arr1,arr2);
    }
    public static void findValidPairs(int[] arr1, int[] arr2){
        int sum1=0,sum2=0;
        for(int n:arr1){
            sum1 +=n;
        }
        for(int n:arr2){
            sum2 +=n;
        }
        if(sum1==sum2){
            System.out.println("No Valid pairs");
        }
        int diff= sum1-sum2;

        Set<Integer> set= new HashSet<>();
        for(int n: arr2){
            set.add(n);
        }
        for(int i=0;i< arr1.length;i++){
            int y= arr1[i]-diff/2;
            if(set.contains(y)){
                System.out.println(arr1[i] +"," + y);
            }
        }
    }
}
