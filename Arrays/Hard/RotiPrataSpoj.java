package Hard;

public class RotiPrataSpoj {

    /*
     * This function checks whether all required pratas can be cooked
     * within the given time limit.
     *
     * Returns:
     * true  -> if totalPrata can be cooked in timeLimit
     * false -> otherwise
     */
    public static boolean isValidAns(int totalPrata, int cooks[], int totalCooks, int timeLimit){

        // Stores total number of pratas cooked by all cooks
        int prataCount = 0;

        // Traverse every cook
        for(int i = 0; i < cooks.length; i++){

            // Rank of current cook
            // Lower rank => Faster cooking
            int currentCookRank = cooks[i];

            // Total time spent by current cook so far
            int timeTaken = 0;

            // Represents the nth prata being cooked
            // 1st prata -> R
            // 2nd prata -> 2R
            // 3rd prata -> 3R ...
            int j = 1;

            /*
             * Keep making pratas until this cook cannot
             * complete the next prata within timeLimit.
             */
            while(timeTaken <= timeLimit){

                // Time needed for next prata
                if(timeTaken + (j * currentCookRank) <= timeLimit){

                    // Add required time
                    timeTaken += j * currentCookRank;

                    // One more prata cooked
                    prataCount++;

                    // Next prata will take more time
                    j++;
                }
                else{
                    // Cannot cook next prata within time limit
                    break;
                }
            }
        }

        // If enough pratas are cooked, this time is possible
        return prataCount >= totalPrata;
    }


    /*
     * Binary Search on Answer
     *
     * Goal:
     * Find the minimum time required to cook P pratas.
     */
    public static int minTimeToCookPrata(int p, int cook[], int n){

        // Find the maximum rank among all cooks
        int maxRank = -1;

        for(int i = 0; i < cook.length; i++){

            if(cook[i] > maxRank){
                maxRank = cook[i];
            }
        }

        /*
         * Search Space
         *
         * Minimum possible time = 0
         *
         * Maximum possible time =
         * Slowest cook cooks all pratas alone.
         *
         * Time Formula:
         * R * (1 + 2 + 3 + ... + P)
         *
         * Sum of first P natural numbers:
         * P * (P + 1) / 2
         */
        int s = 0;
        int e = maxRank * (p * (p + 1) / 2);

        // Stores minimum valid answer found
        int ans = -1;

        // Standard Binary Search
        while(s <= e){

            int mid = s + (e - s) / 2;

            /*
             * If all pratas can be cooked within mid time,
             * then try finding an even smaller answer.
             */
            if(isValidAns(p, cook, n, mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                /*
                 * If impossible within mid time,
                 * increase the available time.
                 */
                s = mid + 1;
            }
        }

        return ans;
    }
}