package Practice;

public class AbundantNo {
    public String checkAbundant(int n) {

        // write your code here
        // An abundant number is a number for which the sum of its proper divisors is greater than the number itself. For example, 12 is an abundant number because its proper divisors are 1, 2, 3, 4, and 6, and their sum is 16, which is greater than 12.

        int i = 1;
        int sum = 0;

        while(i < n) {

            if(n % i == 0) {
                sum += i;
            }

            i++;
        }

        if(sum > n) {
            return "Yes";
        }
        else {
            return "No";
        }

    }
}
