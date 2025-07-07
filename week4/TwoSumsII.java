package week4;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumsII {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    public static int[] twoSum(int [] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int soma = nums[left] + nums[right];
            if (soma == target) {
                return new int[]{left + 1, right + 1};
            }
            if (soma < target) {
                left++;
            }
            if (soma > target) {
                right--;
            }
        }
        return null;
    }
}
