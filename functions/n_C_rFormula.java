public class n_C_rFormula {
    
    //formula : n! / (r!(n-r)!) = nCr

    int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    int nCr(int n ,int r){
        int fact_r=factorial(r);
        int fact_n= factorial(n);
        int fact_nmr=factorial(n-r);
        int res = fact_n / (fact_r*fact_nmr);
        System.out.println("\nThe nCr Solution of n = " + n + " & r = " + r + " is : " + res );
        return res;
    }
    public static void main(String[] args) {
        int n=5 , r=2;
        n_C_rFormula obj = new n_C_rFormula();
        obj.nCr(n,r);
        
    }
}
