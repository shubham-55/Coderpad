package gs.coderpad.arrays;

import java.util.*;

public class RelativeOrdering {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        getRelativeOrdering(arr1,arr2);
    }
    public static void getRelativeOrdering(int[] arr1,int[] arr2){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i< arr2.length;i++){
            map.put(arr2[i],i);
        }
        List<Integer> orederedList = new ArrayList<>();
        List<Integer> remainingList = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                orederedList.add(arr1[i]);
            }else {
                remainingList.add(arr1[i]);
            }
        }
        Collections.sort(remainingList);
        Collections.sort(orederedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        orederedList.addAll(remainingList);
        System.out.println(orederedList);
    }
}
