package daily;

import java.util.ArrayList;

public class CountHillsAndValleys {

    public static void main(String[] args) {
        int[] arr = {2,4,1,1,6,5};
        System.out.println(countHillValley(arr));
    }

    public static int countHillValley(int[] nums) {
        int count = 0;
        ArrayList<Integer> filteredArray = new ArrayList<>();
        filteredArray.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                filteredArray.add(nums[i]);
            }
        }

        for (int i = 1; i < filteredArray.size() - 1; i++) {
            int current = filteredArray.get(i);
            int leftNeighbor = filteredArray.get(i - 1);
            int rightNeighbor = filteredArray.get(i + 1);
            //hills
            if (current > leftNeighbor && current > rightNeighbor) {
                count++;
            }
            //valleys
            if (current < leftNeighbor && current < rightNeighbor) {
                count++;
            }
        }

        return count;
    }

}
