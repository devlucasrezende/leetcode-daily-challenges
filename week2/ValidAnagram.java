package week2;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagramSorted("aacc", "ccac"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charCounts.containsKey(c) || charCounts.get(c) == 0) {
                return false;
            }
            charCounts.put(c, charCounts.get(c) - 1);
        }

        return true;
    }

    public static boolean isAnagramSorted(String s, String t) {
        char[] stringA = s.toCharArray();
        char[] stringB = t.toCharArray();

        Arrays.sort(stringA);
        Arrays.sort(stringB);

        return Arrays.equals(stringA, stringB);
    }
}
