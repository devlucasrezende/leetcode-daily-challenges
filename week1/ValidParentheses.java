package week1;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }

    public static boolean isValid(String s) {
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                arr.add(s.charAt(i));
            } else {
                if (arr.isEmpty()) {
                    return false;
                }
                Character top = arr.getLast();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
                arr.removeLast();
            }

        }
        return arr.isEmpty();
    }
}


