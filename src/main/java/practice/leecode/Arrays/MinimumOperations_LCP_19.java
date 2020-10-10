package practice.leecode.Arrays;

public class MinimumOperations_LCP_19 {

    public int minimumOperations(String leaves) {
        int count = 0;
        if (leaves.charAt(0) == 'y') {
            count++;
        }
        if (leaves.charAt(leaves.length() - 1) == 'y') {
            count++;
        }
        int count_r = 0;
        int count_y = 0;
        for (int i = 1; i < leaves.length() - 1; i++) {

        }

        return count;
    }

}
