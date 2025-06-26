package practice;

public class MinimumTimeVisitingAllPoints {

    public static void main(String[] args) {
        int[][] arr = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(arr));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];

            int diffX = Math.abs(x1 - x2);
            int diffY = Math.abs(y1 - y2);

            int timeForSegment = Math.max(diffX, diffY); //pega o valor maior o max

            totalTime += timeForSegment;
        }

        return totalTime;
    }

}
