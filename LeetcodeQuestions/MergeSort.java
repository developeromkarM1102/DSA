package LeetcodeQuestions;

public class MergeSort {

	static void merge(int [] arr, int s, int e, int mid) {
		
		// Calculate lengths
		int leftArrLen = mid - s + 1;
		int rightArrLen = e - mid;
		
		// Create temporary arrays
		int[] leftArr = new int[leftArrLen];
		int[] rightArr = new int[rightArrLen];
		
		// Copy left half
		int k = s;
		for (int i = 0; i < leftArrLen; i++) {
			leftArr[i] = arr[k];
			k++;
		}
		
		// Copy right half
		k = mid + 1;
		for (int j = 0; j < rightArrLen; j++) {
			rightArr[j] = arr[k];
			k++;
		}
		
		// Merge
		int i = 0;
		int j = 0;
		k = s;
		
		while (i < leftArrLen && j < rightArrLen) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		// Copy remaining left elements
		while (i < leftArrLen) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		// Copy remaining right elements
		while (j < rightArrLen) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
	
	public void mergeSort(int arr[], int l, int r) {
		// code here
		int s = l;
		int e = r;
		
		if (s >= e) {
			return;
		}
		
		// break into two halfs
		int mid = (s + e)/2;
		// sort the left half using recursion
		mergeSort(arr, s, mid);
		// sort the right half using recursion
		mergeSort(arr, mid + 1, e);
		// merge the both half
		merge(arr, s, e, mid);
	}
}
