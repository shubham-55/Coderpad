package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSum {
    public static void main(String[] args) {
        int[] arr= {12,7,29,6, 2, 11,4,8};
        int sum=19;
        findContinousSum(arr,sum);
    }
    public static void findContinousSum(int[] arr, int sum){
        List<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =1;i< arr.length;i++){
            ArrayList<Integer> l = new ArrayList<Integer>();
            if(arr[i-1]==sum){
                l.add(arr[i-1]);
            } else if( arr[i-1]+arr[i]==sum){
                l.add(arr[i-1]);
                l.add(arr[i]);
            }
            if(l.size()!=0) {
                list.add(l);
            }
        }
        System.out.println(list);
    }
}
