package practice;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumberOptimized(arr));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                value++;
            }

        }
        return value;
    }

    public static int missingNumberOptimized(int[] nums) {
        int n = nums.length;

        //formula para ver a somatoria de todos os numeros
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return (expectedSum - actualSum);
    }

}
