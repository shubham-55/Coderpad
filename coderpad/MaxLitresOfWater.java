package gs.coderpad;

public class MaxLitresOfWater {

    public static int maxLiters(int n, int glass, int plastic, int exchange) {
        // Calculate effective cost of glass bottle after refund
        int effectiveGlassCost = glass - exchange;

        // If glass bottle is more expensive (even after refund) than plastic bottle, only buy plastic bottles
        if (effectiveGlassCost > plastic) {
            return n / plastic;
        }

        // Initialize maximum liters variable
        int maxLiters = 0;

        // Try buying 0 to maximum possible glass bottles
        for (int glassBottles = 0; glassBottles <= n / glass; glassBottles++) {
            // Cost of buying glass bottles
            int costForGlassBottles = glassBottles * glass;

            // Money left after buying glass bottles
            int remainingMoney = n - costForGlassBottles;

            // Refund for the empty glass bottles
            int refund = glassBottles * exchange;

            // Total money available to spend after refund
            int totalMoneyAvailable = remainingMoney + refund;

            // Calculate total liters of water
            int totalLiters = glassBottles + (totalMoneyAvailable / plastic);

            // Update maximum liters
            maxLiters = Math.max(maxLiters, totalLiters);
        }

        return maxLiters;
    }

    public static void main(String[] args) {
        int n = 15;      // Total money
        int glass = 4;  // Cost of glass bottle
        int plastic = 6; // Cost of plastic bottle
        int exchange = 3; // Refund for empty glass bottle

        // Calculate and print the maximum liters of water
        System.out.println(maxLiters(n, glass, plastic, exchange));
    }
}
