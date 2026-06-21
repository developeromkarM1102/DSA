package Easy;

import java.util.HashMap;

public class ModofArray {

    public static int getMod(int arr[]) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Store frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find element with maximum frequency
        int maxfreq = -1;
        int maxfreqKey = -1;

        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);

            if (currentFreq > maxfreq) {
                maxfreq = currentFreq;
                maxfreqKey = key;
            }
        }

        return maxfreqKey;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,2,3,3,3,5,5};

        int ans = getMod(arr);
        System.out.println(ans);
    }
}