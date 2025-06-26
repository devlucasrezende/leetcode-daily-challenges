package practice;

import java.util.Arrays;
import java.util.HashMap;
import org.w3c.dom.ls.LSOutput;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temporarySortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temporarySortedArray);
        int[] result = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < temporarySortedArray.length; i++) {
            if (!map.containsKey(temporarySortedArray[i])) {
                map.put(temporarySortedArray[i], i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }

}
