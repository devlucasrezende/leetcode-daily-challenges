package week3;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {


    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
    static Map<Integer, Integer> memo = new HashMap<>();
    public static int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);
        return result;

    }

}
