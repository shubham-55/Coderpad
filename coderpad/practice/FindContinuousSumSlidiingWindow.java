package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindContinuousSumSlidiingWindow {
    public static void main(String[] args) {
        int[] arr= {12,7,29,6, 2, 11,4,8};
        int sum=19;
        findContinousSum(arr,sum);
    }
    public static void findContinousSum(int[] arr, int sum){
        List<List<Integer>> result = new ArrayList<>();
        int start=0;
        int currentSum=0;
        for(int end=0;end<arr.length;end++){
            currentSum+=arr[end];    //12
            while(currentSum>sum && start<=end){
                currentSum -=arr[start];
                start++;
            }
            if (currentSum == sum) {
                List<Integer> subArray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subArray.add(arr[i]);
                }
                result.add(subArray);
            }
        }
        System.out.println(result);
    }
}
