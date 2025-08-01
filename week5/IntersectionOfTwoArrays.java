package week5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                result.add(i);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
