package gs.coderpad.arrays;

import java.util.Arrays;

public class MinimumNotes {
    public static void main(String[] args) {
        int[] currency={100,500};
        int amount=1200;
        calculateMinimumNotes(currency,amount);
    }

    public static void calculateMinimumNotes(int[] currency,int amount) {
        Arrays.sort(currency);
        int count=0;
        for(int i=currency.length-1;i>=0;i--){
            while(amount>=currency[i]) {
                amount = amount - currency[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
