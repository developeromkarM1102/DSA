class reverseNumber {
    public int reverse(int n) {
        int reverseNumber=0;

        while(n!=0)
        {
            int ld=n%10;
            if (reverseNumber > Integer.MAX_VALUE / 10 ||
               (reverseNumber == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0;
            }

            if (reverseNumber < Integer.MIN_VALUE / 10 ||
               (reverseNumber == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0;
            }
            
            reverseNumber=(reverseNumber*10)+ld;
            n=n/10;
        }
        return reverseNumber;
    }
}