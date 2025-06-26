package practice;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(arr)); // Expected: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (top <= bottom && left <= right) {

            // 1. Percorrer da esquerda para a direita (linha superior)
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++; // Move o limite superior para baixo

            // 2. Percorrer de cima para baixo (coluna da direita)
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--; // Move o limite da direita para a esquerda

            // 3. Percorrer da direita para a esquerda (linha inferior)
            // Condição: só executa se ainda houver uma linha inferior válida
            if (top <= bottom) { // Essencial para matrizes de linha única
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--; // Move o limite inferior para cima
            }

            // 4. Percorrer de baixo para cima (coluna da esquerda)
            // Condição: só executa se ainda houver uma coluna esquerda válida
            if (left <= right) { // Essencial para matrizes de coluna única
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }
        return result;
    }
}