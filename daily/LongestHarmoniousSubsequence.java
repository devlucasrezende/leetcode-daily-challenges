package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class LongestHarmoniousSubsequence {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(findLHS(arr));
    }

    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        Set<Entry<Integer, Integer>> entries = map.entrySet();
        for (Entry<Integer, Integer> entry : entries) {
            int num = entry.getKey(); // O número atual que estamos verificando
            int freqOfNum = entry.getValue(); //frequencia do numero atual
            if (map.containsKey(num + 1)) {
                int freqOfNumPlus1 = map.get(num + 1);
                int currentHarmoniousLength = freqOfNum + freqOfNumPlus1;
                if (currentHarmoniousLength > maxLength) {
                    maxLength = currentHarmoniousLength;
                }
            }
        }


        return maxLength;
    }



}
