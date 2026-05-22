package Practice;
import java.util.Scanner;

public class AutomorphicNo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         /* write your code here */

         // An automorphic number is a number whose square ends with the same digits as the number itself. For example, 25 is an automorphic number because 25^2 = 625, which ends with 25.

        int n = sc.nextInt();

        int square = n * n;
        int temp = n;

        int digits = 0;

        while(temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int divisor = 1;

        for(int i = 0; i < digits; i++) {
            divisor *= 10;
        }

        if(square % divisor == n) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
