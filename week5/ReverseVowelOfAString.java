package week5;

public class ReverseVowelOfAString {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] charArray = s.toCharArray();
        while (left < right) {
            while (left < right && isVowel(charArray[left])) {
                left++;
            }
            while (left < right && isVowel(charArray[right])) {
                right--;
            }
            if (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
            }
            left++;
            right--;

        }

        return new String(charArray);
    }

    private static boolean isVowel(char a) {
        a = Character.toLowerCase(a);
        return a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u';
    }

}
