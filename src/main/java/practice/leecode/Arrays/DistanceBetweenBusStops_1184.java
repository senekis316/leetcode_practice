package practice.leecode.Arrays;

public class DistanceBetweenBusStops_1184 {

    // 方法二: 求差法
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = 0;
        for (int i = 0; i < distance.length; i++) {
            sum += distance[i];
        }
        if (start > destination) {
            start = start ^ destination;
            destination = start ^ destination;
            start = start ^ destination;
        }
        int forward = 0;
        for (int i = start; i < destination; i++) {
            forward += distance[i];
        }
        return Math.min(forward, sum - forward);
    }

    // 方法一: 取模法
    /*public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int forward = 0;
        for (int i = start; i % distance.length != destination; i++) {
            forward += distance[i % distance.length];
        }
        int reverse = 0;
        for (int j = destination; j % distance.length != start; j++) {
            reverse += distance[j % distance.length];
            if (reverse > forward) {
                return forward;
            }
        }
        return reverse;
    }*/

}
