package daily;

public class MaximumLengthOfValidSubsequence {

    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2,1,2};
        System.out.println(maximumLength(arr));
    }

    public static int maximumLength(int[] nums) {
        int contagemPares = 0;
        int contagemImpares = 0;
        int lenTerminadoEmPar = 0;
        int lenTerminadoEmImpar = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                contagemPares++;
            } else {
                contagemImpares ++;
            }
        }
        int maxParidade = Math.max(contagemPares, contagemImpares);

        for (int num : nums) {
            if (num % 2 == 0) {
                lenTerminadoEmPar = lenTerminadoEmImpar + 1;
            } else {
                lenTerminadoEmImpar = lenTerminadoEmPar + 1;
            }
        }
        int maxLen = Math.max(lenTerminadoEmPar, lenTerminadoEmImpar);
        return Math.max(maxParidade, maxLen);

    }

}
