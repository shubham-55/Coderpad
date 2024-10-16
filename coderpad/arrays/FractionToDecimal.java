package gs.coderpad.arrays;

import java.util.HashMap;

public class FractionToDecimal {
    public static String fractionToDecimal(int numerator, int denominator) {
        // Handle edge case for zero numerator
        if (numerator == 0) {
            return "0";
        }

        // Determine the sign of the result
        StringBuilder result = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Work with positive values for numerator and denominator
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Calculate the integral part
        long integralPart = num / den;
        result.append(integralPart);

        // Calculate the remainder
        long remainder = num % den;
        if (remainder == 0) {
            return result.toString(); // No decimal part
        }

        // Append the decimal point
        result.append(".");

        // To store the positions of the remainders
        HashMap<Long, Integer> remainderMap = new HashMap<>();
        remainderMap.put(remainder, result.length()); // Position after the decimal point

        // Generate the decimal part
        while (remainder != 0) {
            // Multiply remainder by 10 to get the next digit
            remainder *= 10;
            long decimalPart = remainder / den;
            result.append(decimalPart);

            // Update remainder
            remainder %= den;

            // Check if this remainder has been seen before
            if (remainderMap.containsKey(remainder)) {
                // Find the position of the start of the repeating part
                int repeatIndex = remainderMap.get(remainder);
                // Insert parentheses for the repeating part
                result.insert(repeatIndex, "(");
                result.append(")");
                break;
            } else {
                // Store the position of the current remainder
                remainderMap.put(remainder, result.length());
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(50, 22));     // "0.5"
        System.out.println(fractionToDecimal(2, 1));     // "2"
        System.out.println(fractionToDecimal(2, 3));     // "0.(6)"
        System.out.println(fractionToDecimal(4, 333));   // "0.(012)"
        System.out.println(fractionToDecimal(1, 5));     // "0.2"
        System.out.println(fractionToDecimal(-1, -6));   // "0.1(6)"
        System.out.println(fractionToDecimal(-1, 2));     // "-0.5"
        System.out.println(fractionToDecimal(1, -2));     // "-0.5"
    }
}

