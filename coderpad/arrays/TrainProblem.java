package gs.coderpad.arrays;

import java.util.Arrays;

public class TrainProblem {
    public static void main(String[] args) {
        String[] arrival= {"9:00", "9:40", "9:50", "11:00", "15:00", "18:00"};
        String[] departure={"11:50", "12:00", "11:20", "11:30", "19:00", "20:00"};
        int n=arrival.length;
        int[] arr = new int[n];
        int[] dep = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = convertToMinutes(arrival[i]);
            dep[i] = convertToMinutes(departure[i]);
        }
        findPlatform(arr,dep);
    }

    public static void findPlatform(int[] arr,int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform=1,maxPlatNeeded=1;
        int i=1,j=0;
        while(i<arr.length && j<dep.length) {
                if(arr[i]<=dep[j]){
                    platform++;
                    i++;
                } else {
                    platform--;
                    j++;
                }
            maxPlatNeeded = Math.max(maxPlatNeeded, platform);

        }
        System.out.println(maxPlatNeeded);
    }
    public static int convertToMinutes(String str){
        String[] str1=str.split(":");
        return Integer.parseInt(str1[0])*60 +Integer.parseInt(str1[1]);
    }
}
