package week3;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] arr = {9,9,9};
        //casos de borda (edge case)
//        int[] arr = {1,2,9};
//        int[] arr = {9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1;  i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

}
