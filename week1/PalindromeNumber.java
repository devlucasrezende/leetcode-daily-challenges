package week1;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
       if (x < 0) {
           return false;
       }
       int resultado = 0;
       int numeroOriginal = x;
       while (x != 0) {
           int resto = x % 10;
           resultado = resultado * 10 + resto;
           x = x / 10;
       }
       return numeroOriginal == resultado;
    }

}
