package gs.coderpad.lastDay;

import java.util.ArrayList;
import java.util.List;

public class FindCSum {
    public static void main(String[] args) {
        int[] arr= {12,7,29,6, 2, 11,4,8};
        int sum=19;
        findContinousSum1(arr,sum);
    }
    public static void findContinousSum1(int[] arr, int sum){
         int start=0;
         int currentSum=0;
         List<List<Integer>> result = new ArrayList<>();
         for(int end=0;end<arr.length;end++){
             currentSum +=arr[end];
             if(currentSum>sum && start<=end){
                 currentSum-=arr[start];
                 start++;
             }
             if(currentSum==sum){
                 List<Integer> list = new ArrayList<>();
                 for(int i=start;i<=end;i++) {
                     list.add(arr[i]);
                 }
                 result.add(list);
             }
         }
         System.out.println(result);
    }
}
