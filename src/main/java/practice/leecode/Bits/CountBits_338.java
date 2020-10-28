package practice.leecode.Bits;

public class CountBits_338 {

    public int[] countBits(int num) {
        int[] nums = new int[num  + 1];
        for (int i = 0; i <= num; i++) {
            int x = i;
            while (x != 0) {
                nums[i]++;
                x &= x - 1;
            }
        }
        return nums;
    }

}
