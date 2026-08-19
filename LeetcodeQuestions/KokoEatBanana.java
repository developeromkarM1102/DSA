package LeetcodeQuestions;

public class KokoEatBanana {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 1;

        for(int pile : piles){
            high = Math.max(high, pile);
        }

        while(low < high){
            
            int mid = low + (high - low) / 2;

            long hours = 0;

            for(int pile : piles){

                hours += (pile + mid - 1) / mid;

                if(hours > h){
                    break;
                }
            }

            if(hours <= h){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
