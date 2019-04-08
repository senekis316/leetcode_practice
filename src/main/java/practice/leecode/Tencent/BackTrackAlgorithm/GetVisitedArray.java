package practice.leecode.qq.BackTrackAlgorithm;

public class GetVisitedArray {

    public static boolean[] getVisitedArray(int[] nums) {
        boolean[] visits = new boolean[nums.length];
        for (int i=0; i<nums.length; i++) {
            visits[i] = false;
        }
        return visits;
    }

}
