package Practice;

public class separateDiditsOfNo {

    public static void main(String[] args) {
        //code for printing digits of a number in reverse order in new line
        int n = 123;
        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
        //output will be
        //3
        //2
        //1
    }

}
