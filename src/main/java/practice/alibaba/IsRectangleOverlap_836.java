package practice.alibaba;

public class IsRectangleOverlap_836 {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1 == null || rec2 == null) {
            return false;
        }
        if (rec1.length < 2 && rec2.length < 2) {
            return false;
        }
        if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0]) {
            return false;
        }
        if (rec1[3] <= rec2[1] || rec2[3] <= rec1[1]) {
            return false;
        }
        return true;
    }

}
