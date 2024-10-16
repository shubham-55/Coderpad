package gs.coderpad.arrays;

import java.util.ArrayList;
import java.util.List;

public class FractionNumber {
    public static void main(String args[]){
        int num=315;
        findFractionNumber(num);
    }
    public static void findFractionNumber(int num){
        if(num <=1){
            System.out.println("Not a fraction number");
        } else {
            System.out.println(findDivisor(num));
        }
    }
    public static List<Integer> findDivisor(int num){
        List<Integer> arr = new ArrayList<>();
        for(int i=2;i<=num;){
                if (num % i == 0) {
                    if (checkPrime(i)) {
                        arr.add(i);
                        num=num/i;
                    }
                }else{
                    i++;
            }
        }
        return arr;
    }
    public static boolean checkPrime(int x){
        for(int i=2;i<x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
