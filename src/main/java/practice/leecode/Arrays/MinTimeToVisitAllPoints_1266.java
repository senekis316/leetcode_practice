package practice.leecode.Arrays;

public class MinTimeToVisitAllPoints_1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int minTotalTime = 0;
        for (int i = 0; i < points.length - 1; i++) {
            minTotalTime += minTimeToBetweenPoint(points[i], points[i + 1]);
        }
        return minTotalTime;
    }

    private int minTimeToBetweenPoint(int[] point1, int[] point2) {
        int xTime = Math.abs(point1[0] - point2[0]);
        int yTime = Math.abs(point1[1] - point2[1]);
        return Math.min(xTime, yTime) + Math.abs(xTime - yTime);
    }

}
