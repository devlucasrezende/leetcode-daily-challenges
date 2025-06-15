package week1;

public class ReverseString {

    public static void main(String[] args) {
        char[] arr = {'S', 'p', 'r', 'i', 'n', 'g', 'b', 'o', 'o', 't'};
        reverseString(arr);
        System.out.println(arr);
    }

    public static void reverseString (char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

}
