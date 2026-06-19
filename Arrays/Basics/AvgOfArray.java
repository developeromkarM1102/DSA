package Basics;

public class AvgOfArray {
    //Get an Average of an array
     static double getAvg(int arr[]){
        double sum = 0;
        for(int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }
    public static void main(String[] args) {
        int arr [] = {5,5,5,5};
        System.out.println(getAvg(arr));
    }
}
