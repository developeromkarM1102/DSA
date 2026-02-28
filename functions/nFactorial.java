public class nFactorial {

    int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("\nFactorial of " + n + " is : " +fact);
        return fact;
    }
    public static void main(String[] args) {
        
        nFactorial obj = new nFactorial();
        obj.fact(5);
    }
}
