package Recursion;

import java.util.Scanner;

//understanding the concept of recursion
//print "Hello" n times using recursion
public class practice {

    void function(int n){

        if(n>0){
            System.out.println("Hello");
            function(n-1);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        practice obj = new practice();
        obj.function(n);
    }
}
