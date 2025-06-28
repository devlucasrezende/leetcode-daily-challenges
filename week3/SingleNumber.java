package week3;

import java.sql.SQLOutput;

public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = {2,2,4,4,5,5,3};
        System.out.println(singleNumber(arr));
    }


    public static int singleNumber(int[] nums) {
        int resultado = 0;
        for (int num : nums) {
            resultado = resultado ^ num;
        }
        return resultado;
    }
}
