package week5;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(arr, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (map.containsKey(currentNumber)) {
                int lastSeenIndex = map.get(currentNumber);
                if (i - lastSeenIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
