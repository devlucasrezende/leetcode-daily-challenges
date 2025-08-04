package daily;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FruitIntoBaskets {

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        System.out.println(totalFruit(arr));
    }

    public static int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
            while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
