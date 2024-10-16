package gs.coderpad.lastDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumElementSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int target=6;
        findMinimumElementSum(arr,target);
    }
    public static void findMinimumElementSum(int[] arr, int target){
        Arrays.sort(arr);
        int sum=0;
        List<Integer> result=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(sum+arr[i]<=target){
                sum+=arr[i];
                result.add(arr[i]);
            }
            if(sum==target){
                break;
            }
        }
        if(sum==target){
            System.out.println(result);
        }
    }
}
