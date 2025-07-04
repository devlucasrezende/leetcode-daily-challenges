package week4;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(firstUniqCharOtimizado("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.get(curr) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqCharOtimizado(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 'a' - 'a' = 0 -> 'b' - 'a' = 1
            int letraNoAlfabeto = c - 'a';
            freq[letraNoAlfabeto]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int qtdDeRepeticaoPorLetra = freq[c - 'a'];
            if (qtdDeRepeticaoPorLetra == 1) {
                return i;
            }
        }
        return -1;
    }

}
