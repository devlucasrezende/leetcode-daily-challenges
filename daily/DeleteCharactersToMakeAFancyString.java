package daily;

public class DeleteCharactersToMakeAFancyString {

    public static void main(String[] args) {
        System.out.println(makeFancyString("aaabaaaa"));
    }

    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int consecutive = 0;
        char previousChar = ' ';
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (previousChar == currentChar) {
                consecutive++;
            } else {
                consecutive = 1;
                previousChar = currentChar;
            }
            if (consecutive < 3) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

}
