package Practice;

import java.util.Scanner;

public class PerfectSquare {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         /* write your code here */
         int n = sc.nextInt();

         int root = (int)Math.sqrt(n);

        if(root * root == n) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
     }
}
