package week1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 7)));
    }

    public static int[] twoSum(int [] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];
           if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
           }
           map.put(nums[i], i);

        }
        return null;
    }
}
