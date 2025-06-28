package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubsequenceOfLengthKWithTheLargestSum {

    public static void main(String[] args) {
        int[] arr = {2,1,3,3};
        int k = 2;
        System.out.println(Arrays.toString(maxSubsequence(arr, k)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        //Isso vai funcionar mais ou menos como uma hashmap (2,0), (1,1), (3,2), (3,3), vai ser uma lista de pares
        List<int[]> valueIndexPairs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            valueIndexPairs.add(new int[]{nums[i], i});
        }
        //isso vai fazer os elementos ficarem em ordem do maior pro menor (3,2), (3,3), (2,0), (1,1)
        valueIndexPairs.sort((a, b) -> Integer.compare(b[0], a[0])); // a[0] e b[0] são os valores
        //cria-se um outro "mapa" (lista de pares) de chave valor e o preenche ate o valor de k (2) com os 2 primeiros elementos do valueIndexPairs (que nesse momento ja sao os maiores)
        List<int[]> topKValueIndexPairs = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topKValueIndexPairs.add(valueIndexPairs.get(i));
        }
        //ordenacao para manter o indice original do array e garantir a subsequencia
        topKValueIndexPairs.sort((a, b) -> Integer.compare(a[1], b[1])); // a[1] e b[1] são os índices
        //Cria-se um array result com o tamanho de k e pega o valor (primeiro elemento do par)
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topKValueIndexPairs.get(i)[0]; // Pegue o valor (primeiro elemento do par)
        }
        return result;
    }



}
