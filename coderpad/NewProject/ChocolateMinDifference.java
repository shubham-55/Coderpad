package gs.coderpad.NewProject;

import java.util.Arrays;

public class ChocolateMinDifference {
    public static void main(String[] args) {
        int[] packets={12, 4, 7, 9, 5, 12, 6};
        int m=4;
        findMinDifference(packets,m);
    }
    public static void findMinDifference(int[] packets,int m){
        int n = packets.length;
        if(m==0 || n==0 || n<m){
            System.out.println("-1");
        }
        Arrays.sort(packets);
        System.out.println(Arrays.toString(packets));
        int minDiff= Integer.MAX_VALUE;

        for(int i=0;i+m-1<n;i++){
            int difference= packets[i+m-1]-packets[i];
            if(difference<minDiff){
                minDiff=difference;
            }
        }
        System.out.println(minDiff);
    }
}
