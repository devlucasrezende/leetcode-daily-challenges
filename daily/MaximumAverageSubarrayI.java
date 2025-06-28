package daily;

public class MaximumAverageSubarrayI {

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSubarray(arr,k));
    }

    public static double maxSubarray(int[] nums, int k) {
        double actualWindowSum = 0;
        double maxSum;
        //aqui vamos fazer a somatoria da primeira janela de tamanho K
        for (int i = 0; i < k; i++) {
            actualWindowSum += nums[i];
        }
        //Atualmente a soma maxima é a primeira janela
        maxSum = actualWindowSum;

        // Loop para deslizar a janela pelo restante do array
        for (int i = k; i < nums.length; i++) {
            // Remove o elemento que saiu da janela pela esquerda
            // (nesse caso, a janela foi de [100, 200, 300] para [200, 300, 400] → removeu o 100)
            actualWindowSum = actualWindowSum - nums[i - k];

            // Adiciona o novo elemento que entrou na janela pela direita
            actualWindowSum = actualWindowSum + nums[i];
            // Compara a soma da janela atual com a soma máxima encontrada até agora
            // e atualiza se a janela atual for maior
            if (actualWindowSum > maxSum) {
                maxSum = actualWindowSum;
            }
        }
        //divide para ter a media
        return maxSum / k;

    }

}
