class Solution {
    public int countDigit(int n) {
        int count=0;

        for(int i=0;i<=n;i++)
        {
            count++;
            n=n/10;
        }
        return count ;
    }
}