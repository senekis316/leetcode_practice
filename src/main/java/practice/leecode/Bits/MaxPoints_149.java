package practice.leecode.Bits;

import java.util.HashMap;
import java.util.Map;

public class MaxPoints_149 {

    Map<String, String> set = new HashMap<>();

//    public int maxPoints(int[][] points) {
//        for (int i = 0; i < points.length - 1; i++) {
//            int[] p1 = points[i];
//            int[] p2 = points[i + 1];
//            int k = 0;
//            int b = 0;
//            p1[1] = k * p1[0] + b;
//            p2[1] = k * p2[0] + b;
//            y = kx + b;
//        }
//    }

    public int maxPoints(int[][] points) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length - 2; i++) {
            int temp = 1;
            int[] p1 = points[i];
            for (int j = i + 1; j < points.length - 1; j++) {
                int[] p2 = points[j];
                for (int z = j + 1; z < points.length; z++) {
                    int[] p3 = points[z];
                    if ((p1[0] - p2[0]) * (p2[1] - p3[1]) == (p2[0] - p3[0]) * (p1[1] - p2[1])) {
                        temp = temp == 1 ? temp + 2 : temp++;
                    }
                }
            }
            max = Math.max(temp, max);
        }
        return max;
    }

}
