public class prime {

    boolean isPrime(int n){

        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        prime obj = new prime();
        int number = 6;

        if(obj.isPrime(number)){
            System.out.println(" \n " + number + " is prime");
        }
        else{
            System.out.println(" \n " + number + " is not prime");
        }
    }
}
