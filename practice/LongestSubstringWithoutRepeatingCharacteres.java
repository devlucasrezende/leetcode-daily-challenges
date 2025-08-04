package practice;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacteres {

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }

    public static int longestSubstring(String string) {
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < string.length(); right++) {
            Character current = string.charAt(right);
            map.put(current, map.getOrDefault(current, 0) + 1);
            while (map.get(current) > 1) {
                Character leftChar = string.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
