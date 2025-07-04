package week3;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }


    //y * y <= x
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1; // O menor resultado possível para x > 0 é 1
        int right = x; // O maior resultado possível é o próprio x
        int ans = 0; // Para armazenar o maior inteiro cujo quadrado é <= x

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Para evitar overflow ao calcular mid * mid, use long
            // ou compare mid com x / mid.
            // Aqui, usamos long para clareza, mas x / mid é mais otimizado para int.
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // Encontrou a raiz quadrada exata
            } else if (square < x) {
                ans = mid; // mid é uma possível resposta, tentamos encontrar uma maior na metade direita
                left = mid + 1;
            } else { // square > x
                right = mid - 1; // mid é muito grande, buscamos na metade esquerda
            }
        }
        return ans;
    }

}
