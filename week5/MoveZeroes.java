package week5;

public class MoveZeroes {

    public static void main(String[] args) {
        int[]arr = {0,1,0,3,12};
        System.out.println(moveZeroes(arr));
    }

    public static String moveZeroes(int[] nums) {
        int ponteiroEscrita = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (current != 0) {
                nums[ponteiroEscrita] = nums[i];
                ponteiroEscrita++;
            }
        }
        for (int i = ponteiroEscrita; i < nums.length; i++) {
            nums[i] = 0;
        }
        return "";
    }

}
