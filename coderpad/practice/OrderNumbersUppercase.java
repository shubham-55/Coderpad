package gs.coderpad.practice;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class OrderNumbersUppercase {
    public static void main(String[] args) {
        String[] strArr={"1","A","B","C","2","3","F","V","5"};
        findOrder(strArr);
    }
    public static void findOrder(String[] strArr){
        int left=0;
        int right= strArr.length-1;
        while(left<right){
            if(Character.isDigit(strArr[left].charAt(0))){
                left++;
            }else{
                String temp=strArr[left];
                strArr[left]=strArr[right];
                strArr[right]=temp;
                right--;
            }
        }
        System.out.println(Arrays.toString(strArr));
    }
}
