package Practice;

import java.util.Scanner;

public class sumOfDigitOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
