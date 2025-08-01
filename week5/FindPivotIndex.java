package week5;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] arr = {2,1,-1};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

}
