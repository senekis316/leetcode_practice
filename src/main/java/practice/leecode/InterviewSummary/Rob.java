package practice.leecode.InterviewSummary;

public class Rob {

    public int rob(int[] nums) {
        int before = 0, after = 0;
        for(int current : nums) {
            after = Math.max(before + current, before = after);
        }
        return after;
    }

}
