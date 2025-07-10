package week4;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 2 == 0 && n > 1) {
            n = n / 2;
        }
        return n == 1;
    }

    public static boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & (n-1)) == 0;

    }


}
