package LeetcodeQuestions;

public class BSonAnswithSqrofX {

        public int mySqrt(int x) {
        
        int s = 1;
        int e = x;
        int ans = -1;

        if(x==0){
            return 0;
        }

        while(s<=e){
            int mid = s + (e - s) / 2;
            //using this formula to avoid integer overflowing instead of mid * mid == x
            if(mid == x/mid){
                return mid;
            }
             //using this formula to avoid integer overflowing instead of mid * mid > x
            else if(mid > x/mid){
                e = mid - 1;
            }
            else{
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
}