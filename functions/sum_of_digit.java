public class sum_of_digit {

    int sumOfdigits(int num){
        int digitsum=0;
        while (num>0) {
            int lastdigit = num%10;
            num /= 10; 

            digitsum += lastdigit;
        }
        System.out.println("\nSum of Digit number : " + digitsum);
        return digitsum;
    }
    public static void main(String[] args) {
      sum_of_digit obj = new sum_of_digit();
      obj.sumOfdigits(123);
    } 
}
