package LeetcodeQuestions;

public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {
        // code here
        int s = low;
        int e = high;
        
        if(s>=e){
            return;
        }
        
        int pivotIndex = partition(arr,s,e);
        
        //sort left part using recursion
        quickSort(arr, s, pivotIndex-1);
        //sort right part using recursion
        quickSort(arr, pivotIndex+1 ,e);
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int s = low;
        int e = high;
        
        int pivotElement = arr[s];
        
        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i] <= pivotElement){
                count++;
            }
        }
        
        int correctPosition = s + count;
        
        int temp = arr[correctPosition];
        arr[correctPosition] = arr[s];
        arr[s] = temp;
        
        int i = s;
        int j = e;
        
        while(i < correctPosition && j > correctPosition){
            while(arr[i] <= pivotElement){
                i++;
            }
            while(arr[j] > pivotElement){
                j--;
            }
            if(i < correctPosition && j > correctPosition){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return correctPosition;
    }
}
