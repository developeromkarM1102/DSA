package BinaryNoSystem;

public class BinaryToDecimal {

    int BinToDec(int binary){

        int ans =0;
        int pow =1;
        while (binary>0) {
            int rem = binary % 10;
            ans += rem*pow;
            binary /=10;
            pow*=2;
        }
        System.out.println("\n"+ans);
        return ans;
    }
    
    public static void main(String[] args) {
        BinaryToDecimal obj = new BinaryToDecimal();
        obj.BinToDec(1010);
    }
}
