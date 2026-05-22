package Practice;

import java.util.Scanner;

public class HCF {
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         /* write your code here */

         // find the highest common factor of two numbers
         
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = 1;
        int hcf = 1;

        while(i <= Math.min(a, b)) {

            if(a % i == 0 && b % i == 0) {
                hcf = i;
            }
            i++;
        }

        System.out.println(hcf);
     }
}
