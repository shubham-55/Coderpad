package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintPascal {
    public static void main(String[] args) {
        int n=5;
        printPascal(n);
    }
    public static void printPascal(int n){
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
         arr[i][0]=1;
         arr[i][i]=1;
         for(int j=1;j<i;j++){
             arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
         }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
