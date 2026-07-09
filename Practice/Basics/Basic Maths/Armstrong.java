class Solution {
    public boolean isArmstrong(int n) {
        
        int original = n;
        int digits = 0;
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }
}
