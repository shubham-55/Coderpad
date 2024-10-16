package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.List;

public class AllPossibility {
    public static void main(String[] args) {
        int num=3;
        List<Integer> combination = new ArrayList<>();
        findPossibilities(num,combination,1);
    }
    public static void findPossibilities(int num, List<Integer> combination, int start){
        if(num==0){
            System.out.println(combination.toString().replace("[","").replace(",","+").replace("]",""));
        }
        for(int i=start;i<=num;i++){
            combination.add(i);
            findPossibilities(num-i,combination,i);
            combination.remove(combination.size()-1);
        }
    }
}
