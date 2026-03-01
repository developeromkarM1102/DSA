public class Two_to_N_prime {
    void isPrime(int n) {

            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { 
                System.out.println("\n " + n);
            }
    }

    public static void main(String[] args) {
        Two_to_N_prime obj = new Two_to_N_prime();
        int n = 5;
        for (int i = 2; i <= n; i++) {
            obj.isPrime(i);
        }
         
    }
}
