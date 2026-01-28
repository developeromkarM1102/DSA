class Solution {
    public boolean isPrime(int n) {
          int count=0;
          if(n<=1) return false;

          for(int i=1;i<=n;i++)
          {
            if(n%i==0)
            {
                count++;
            }
          }
            if(count==2)
            {
                return true;
            }
            return false;
    }
}