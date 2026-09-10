package BitManipulation;

public class DivideTwoInteger {

    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Check if answer should be negative
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to long to prevent overflow
        long dividendAbs = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);

        long quotient = 0;

        while (dividendAbs >= divisorAbs) {

            long temp = divisorAbs;
            long multiple = 1;

            // Double divisor as much as possible
            while (dividendAbs >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest possible multiple
            dividendAbs -= temp;
            quotient += multiple;
        }

        // Apply sign
        if (negative) {
            quotient = -quotient;
        }

        return (int) quotient;
    }
}
