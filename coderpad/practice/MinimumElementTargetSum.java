package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MinimumElementTargetSum {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int target=6;
        System.out.println(findMinimumElement(arr, target));
    }
    public static String findMinimumElement(int[] arr,int target){
        int sum=0;
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(sum+arr[i]<=target) {
                sum += arr[i];
                list.add(arr[i]);
            }
            if(sum==target){
                break;
            }
        }
        if(sum==target){
            StringBuilder result= new StringBuilder();
            for(int i=0;i<list.size();i++){
                result.append(list.get(i));
                if(i<list.size()-1){
                    result.append("+");
                }
            }
            return result.append(" = ").append(target).toString();
        }
        return "-1";
    }
}
