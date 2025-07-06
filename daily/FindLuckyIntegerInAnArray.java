package daily;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class FindLuckyIntegerInAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (Objects.equals(integerIntegerEntry.getValue(), integerIntegerEntry.getKey())) {
                if (integerIntegerEntry.getValue() > 0) {
                    maxValue = integerIntegerEntry.getValue();
                }
            }
        }
        return maxValue == 0 ? -1 : maxValue;
    }

}
