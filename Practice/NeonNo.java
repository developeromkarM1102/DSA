package Practice;

public class NeonNo {

    public String checkNeon(int n) {

        // write your code here
        // A neon number is a number where the sum of the digits of its square is equal to the number itself. For example, 9 is a neon number because 9^2 = 81, and the sum of the digits of 81 is 8 + 1 = 9.

        int square = n * n;
        int sum = 0;

        while(square > 0) {

            int digit = square % 10;
            sum += digit;
            square = square / 10;
        }

        if(sum == n) {
            return "Yes";
        }
        else {
            return "No";
        }
        
    }
}
