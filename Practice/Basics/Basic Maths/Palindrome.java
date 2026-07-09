class Solution {
    public boolean isPalindrome(int n) {
        int rev =0 ;
        int dup=n;

        if (n<0)
        {
            return false;
        }

        while(n!=0)
        {
            int ld= n%10;
            rev = (rev*10)+ld;
            n=n/10;
        }
        if(rev == dup)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}