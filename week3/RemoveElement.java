package week3;


public class RemoveElement {

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int ponteiroEscrita = 0;
        for (int ponteiroLeitura = 0; ponteiroLeitura < nums.length; ponteiroLeitura++) {
            if (nums[ponteiroLeitura] != val) {
                nums[ponteiroEscrita] = nums[ponteiroLeitura];
                ponteiroEscrita++;
            }
        }
        return ponteiroEscrita;
    }

}
