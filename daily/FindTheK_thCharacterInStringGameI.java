package daily;

public class FindTheK_thCharacterInStringGameI {

    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }

    public static char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            int currentLength = word.length();
            StringBuilder partToAppend = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                char nextChar = (char) (currentChar + 1);
                partToAppend.append(nextChar);
            }
            word.append(partToAppend);
        }
        return word.charAt(k - 1);
    }

}
