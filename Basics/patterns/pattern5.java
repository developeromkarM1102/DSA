import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int num =1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}


//1 2 3 
//4 5 6
//7 8 9
