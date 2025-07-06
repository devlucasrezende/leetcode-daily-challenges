package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FindSumPairs {

    private final int[] nums1;
    private final int[] nums2;
    Map<Integer, Integer> freqNums1 = new HashMap<>();
    Map<Integer, Integer> freqNums2 = new HashMap<>();
    List<Integer> sortedKeys1;



    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        for (int i : nums1) {
            freqNums1.put(i, freqNums1.getOrDefault(i, 0) + 1);
        }
        sortedKeys1 = new ArrayList<>(freqNums1.keySet());
        Collections.sort(sortedKeys1);
        this.nums2 = nums2;
        for (int k : nums2) {
            freqNums2.put(k, freqNums2.getOrDefault(k, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        if (freqNums2.containsKey(oldVal)) {
            freqNums2.put(oldVal, freqNums2.get(oldVal) - 1);
            if (freqNums2.get(oldVal) == 0) {
                freqNums2.remove(oldVal);
            }
        }
        nums2[index] += val;
        int newVal = nums2[index];
        freqNums2.put(newVal, freqNums2.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot) {
        int totalPairs = 0;
        for (int k : sortedKeys1    ) {
            if (k > tot) break;
            Integer c2 = freqNums2.get(tot - k);
            if (c2 != null) {
                totalPairs += freqNums1.get(k) * c2;
            }
        }
        return totalPairs;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */