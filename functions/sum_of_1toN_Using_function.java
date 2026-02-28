public class sum_of_1toN_Using_function {
    
    //sum of 1 to N

    int sumN(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.println("\n" +sum);
        return sum;
    }
    public static void main(String[] args) {
        
        sum_of_1toN_Using_function obj = new sum_of_1toN_Using_function();
        obj.sumN(5);
        
        
        
    }
}
