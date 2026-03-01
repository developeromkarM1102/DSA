package BinaryNoSystem;

public class DecimalToBinary {

    int decTobinary(int decimal){
        int ans =0;
        int pow =1;

        while(decimal>0){
            int rem = decimal % 2;
            decimal /=2;

            ans +=(rem*pow);
            pow *=10;
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
      
            DecimalToBinary obj = new DecimalToBinary();
            obj.decTobinary(50);
        }
    }

