package LeetcodeQuestions;

public class InversionCount {
    
	static int merge(int arr [], int s, int e, int mid) {
		
		//calculating the length of left and right Arr
		int leftArrLen = mid - s + 1;
		int rightArrLen = e - mid;
		
		//assigning length to arr
		int leftArr [] = new int [leftArrLen];
		int rightArr [] = new int [rightArrLen];
		
		
		int k = s;
		for (int i = 0; i<leftArrLen; i++) {
			leftArr[i] = arr[k];
			k++;
		}
		k = mid + 1;
		for (int j = 0; j<rightArrLen; j++) {
			rightArr[j] = arr[k];
			k++;
		}
		
		int i = 0;
		int j = 0;
		k = s;
		int invCount = 0;
		
		while (i < leftArrLen && j < rightArrLen) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				k++;
				i++;
			}
			else {
				arr[k] = rightArr[j];
				k++;
				j++;
				
				//formula to count inversions
				invCount = invCount + (leftArrLen - i);
			}
		}
		
        //copying tem arr to actual arr
		while (i < leftArrLen) {
			arr[k] = leftArr[i];
			k++;
			i++;
		}
		while (j < rightArrLen) {
			arr[k] = rightArr[j];
			k++;
			j++;
		}
		
		return invCount;
		
	}
	
	static int mergeSort(int arr[], int s, int e) {
		// base case
		if (s>e) {
			return 0;
		}
        //if only one elem is there
		if (s == e) {
			return 0;
		}
		
        //calculating Mid
		int mid = (s + e) / 2;
		
        //find leftInversion Using Recursion
		int leftInversion = mergeSort(arr, s, mid);
		//Find rightInversion using recursion 
		int rightInversion = mergeSort(arr, mid + 1, e);
		//Find intermediateInversion using recusion while doing merge
		int intermediateInversion = merge(arr, s, e, mid);
		
        //getting overall Inversion Count
		int invCount = leftInversion + rightInversion + intermediateInversion;
		return invCount;
		
	}
	
	public int inversionCount(int arr[]) {
		// code here
		int s = 0;
		int e = arr.length - 1;
		int ans = mergeSort(arr, s, e);
		return ans;
	}
}
