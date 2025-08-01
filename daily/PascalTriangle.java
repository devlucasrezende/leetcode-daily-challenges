package daily;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j<= i; j++) {
                //significa que sao os numeros da extremidade
                if (j == 0 || j == i) {
                    rows.add(1);
                } else {
                    int aboveLeft = triangle.get(i - 1).get(j - 1);
                    int aboveRight = triangle.get(i - 1).get(j);
                    rows.add(aboveLeft + aboveRight);
                }
            }
            triangle.add(rows);
        }
        return triangle;
    }

}
