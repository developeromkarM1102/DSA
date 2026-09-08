package BitManipulation;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        //n & (n - 1) == 0
        //Example =>
        /*  
            8     = 1000
            8 - 1 = 0111
            ------------
            &       0000 
        */
        return n > 0 && (n & (n - 1)) == 0;
    }
}
