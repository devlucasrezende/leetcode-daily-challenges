package daily;

import java.util.HashSet;

public class MaximumErasureValue {

    public static void main(String[] args) {
        int[] arr = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(arr));
    }

    public static int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int maxScore = 0;
        HashSet<Integer> seen = new HashSet<>();
        while (right < nums.length) {
            while (seen.contains(nums[right])) {
                seen.remove(nums[left]);
                currentSum = currentSum - nums[left];
                left++;
            }
            seen.add(nums[right]);
            currentSum += nums[right];
            right++;
            maxScore = Math.max(maxScore, currentSum);
        }
        return maxScore;
    }

}
