public class pattern6 {
    public static void main(String[] args) {

        int n = 5; // You can change this value to adjust the pattern size
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


/* This is the pattern that will be printed for n=5:
 * * * * * 
 * * * * 
 * * * 
 * * 
 * 
 */