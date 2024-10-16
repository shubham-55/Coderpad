package gs.coderpad.arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPossibilities {
    public static void main(String[] args) {
        int n=3;
        List<Integer> list = new ArrayList<>();
        printPossibilities(n,list);
    }
    public static void printPossibilities(int n,List<Integer> list){

        if(n==0){
            System.out.println(list);
        }
        for(int i=1;i<=n;i++) {
            list.add(i);
            printPossibilities(n - 1, list);
        }
    }
}
