package LeetcodeQuestions;

public class checkSubsequenceSumK {

        static boolean solve(int arr [], int k, int sum, int index){
        
        if(index >= arr.length){
            
            if(sum == k){
                return true;
            }
            else{
                return false;
            }
        }
        
        int currValue = arr[index];
        
        //recursion using include-exclude pattern 
        boolean includeAns = solve(arr, k, sum + currValue, index+1);
        
        boolean excludeAns = solve(arr, k, sum, index+1);
        
        boolean finalAns = includeAns || excludeAns;
        
        return finalAns;
        
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        int index = 0;
        
        int sum = 0;
        
        boolean ans = solve(arr, k, sum, index);
        
        return ans;
    }
}