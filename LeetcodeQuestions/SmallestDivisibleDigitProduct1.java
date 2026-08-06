package LeetcodeQuestions;

public class SmallestDivisibleDigitProduct1 {

    public int smallestNumber(int n, int t) {

        while (true) {

            int temp = n;
            int product = 1;

            //calculating Product 
            while (temp > 0) {
                int digit = temp % 10;
                product *= digit;
                temp /= 10;
            }

            //checking that product is divisibal
            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }
}
