package practice.leecode.Arrays;

public class DecompressRLElist_1313 {

    public int[] decompressRLElist(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        int index = 0;
        int[] res = new int[count];
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                res[index++] = nums[i + 1];
            }
        }
        return res;
    }

    /*public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new LinkedList<>();
        for(int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                res.add(nums[i + 1]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }*/

}
