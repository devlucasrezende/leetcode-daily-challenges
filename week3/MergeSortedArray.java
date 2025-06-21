package week3;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ponteiro1 = m - 1;
        int ponteiro2 = n - 1;
        int writeP1 = m + n - 1;
        while (ponteiro1 >= 0 && ponteiro2 >= 0) {
            if (nums1[ponteiro1] > nums2[ponteiro2]) {
                nums1[writeP1] = nums1[ponteiro1];
                ponteiro1--;
            } else {
                nums1[writeP1] = nums2[ponteiro2];
                ponteiro2--;
            }
            writeP1--;
        }

        while (ponteiro2 >= 0) {
            nums1[writeP1] = nums2[ponteiro2];
            ponteiro2--;
            writeP1--;
        }

        System.out.println(Arrays.toString(nums1));

    }

}
