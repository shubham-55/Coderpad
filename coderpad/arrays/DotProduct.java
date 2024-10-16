package gs.coderpad.arrays;

import java.util.Arrays;

public class DotProduct {
    public static void main(String args[]){
        int[] arr1={1, 2, 3, 4, 5};
        int[] arr2 = null;
        System.out.println(calculateDotProduct(arr1,arr2));
    }
    public static int calculateDotProduct(int[] arr1,int[] arr2){
        if(arr1==null || arr2==null){
            return 0;
        }
        if (arr1.length==0 || arr2.length==0){
            return 0;
        }
        int product=0;
        if(arr1.length==arr2.length){
            int i=0;

            while(i<arr1.length){
                product=product+(arr1[i]*arr2[i]);
                i++;
            }

        }
        return product;
    }
}
