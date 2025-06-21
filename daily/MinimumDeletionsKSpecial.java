package daily;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class MinimumDeletionsKSpecial {

    public static void main(String[] args) {
        System.out.println(minimumDeletions("aabcaba", 0));
    }

    public static int minimumDeletions(String word, int k) {
        int minDeletions = Integer.MAX_VALUE;
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : word.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        //significa que so tem 1 tipo de letra
        if (charCounts.size() == 1) {
            return 0;
        }
        Integer[] arrFrequencies = charCounts.values().toArray(new Integer[0]);
        Arrays.sort(arrFrequencies);

        for (int i = 0; i < arrFrequencies.length; i++) {
            int currentMinFreqTarget = arrFrequencies[i]; //min Freq hipotetico
            int currentMaxFreqAllowed = currentMinFreqTarget + k; //limite superior
            int currentDeletionsForThisTarget = 0;
            for (Integer freq : arrFrequencies) {
                if (freq < currentMinFreqTarget) {
                    currentDeletionsForThisTarget += freq;
                } else if (freq > currentMaxFreqAllowed) {
                    currentDeletionsForThisTarget += (freq - currentMaxFreqAllowed);
                }
            }
            minDeletions = Math.min(minDeletions, currentDeletionsForThisTarget);

        }

        return minDeletions;
    }

}
