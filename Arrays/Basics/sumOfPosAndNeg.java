package Basics;

public class sumOfPosAndNeg {
    
    public static int[] SumOfPosORNeg(int arr[]) {
        int sum = 0;
        int nSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                sum += arr[i];
            else
                nSum += arr[i];
        }
        int ans[] = { sum, nSum };
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 5 };
        int ans[] = SumOfPosORNeg(arr);
        System.out.println("Positive Sum : " + ans[0]);
        System.out.println("Negative Sum : " + ans[1]);
    }
}
