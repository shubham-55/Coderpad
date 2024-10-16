package gs.coderpad;

/**Given N Rupees. A liter plastic bottle of water costs A
        Rupees and a litre of glass bottle of water costs B
        Rupees. But the empty glass bottle after buying can be exchanged for C
        Rupees. Find the maximum liters of water which can be bought with N    Rupees. **/
public class FindWater {
    public static void main(String[] args) {
        int n=15;
        int glass=4;
        int plastic=6;
        int exchange=3;
        findMaxLitre(n,glass,plastic,exchange);
    }
    public static void findMaxLitre(int n,int glass,int plastic,int exchange){
        int waterBought=0;
        int netGlassPrice= glass-exchange;
        while(n>=glass || n>=plastic) {
            if (netGlassPrice <= plastic) {
                waterBought=waterBought+1;
                n = n - netGlassPrice;
            } else {
                waterBought=waterBought+1;
                n = n - plastic;
            }
        }
        System.out.println(waterBought);
    }
}
