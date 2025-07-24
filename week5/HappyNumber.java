package week5;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        int currentNumber = n;
        while (currentNumber != 1 && !seenNumbers.contains(currentNumber)) {
            seenNumbers.add(currentNumber);
            int novaSoma = 0;
            int tempNum = currentNumber;
            while (tempNum > 0) {
                int digito = tempNum % 10;

                novaSoma += digito * digito;
                tempNum /= 10;
            }
            currentNumber = novaSoma;


        }
        return currentNumber == 1;
    }


}
