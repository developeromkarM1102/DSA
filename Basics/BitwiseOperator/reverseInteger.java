package BitwiseOperator;
public class reverseInteger {

    int reverseNO(int num) {

        int reverse =0;

        while (num>0) {

            int lastdigit = num%10; // extract last digit
            num /=10;               //shift number right

            reverse = reverse * 10 + lastdigit;
        }
        System.out.println("\nReverse of an No is : " + reverse);
        return reverse;
    }

    public static void main(String[] args) {
        reverseInteger obj = new reverseInteger();
        obj.reverseNO(123);
    }
}
