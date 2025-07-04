package daily;

public class FindTheOriginalTypedStringI {

    public static void main(String[] args) {
        System.out.println(possibleStringCount("abcd"));
    }

    public static int possibleStringCount(String word) {
        char previousChar = word.charAt(0);
        int resposta = 0;
        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (previousChar == currentChar) {
                resposta++;
            } else {
                previousChar = currentChar;
            }
        }
        return resposta + 1;
    }

}
