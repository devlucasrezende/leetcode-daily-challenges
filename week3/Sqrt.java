package week3;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }


    //y * y <= x
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return 0;
        }
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int square = mid * mid;
            if (square == x) {
                return mid;
            }
            if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return ans;
    }

}
