package Basics;

public class Multipleof10 {

    public static int[] getMultipleof10(int arr[]) {
        int size = arr.length;
        int newArr[] = new int[size];

        for (int i = 0; i < size; i++) {
            int elem = arr[i];
            int newElem = elem * 10;
            newArr[i] = newElem;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };
        int ans[] = getMultipleof10(arr);

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
