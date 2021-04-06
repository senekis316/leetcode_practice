package practice.leecode.Arrays;

public class RemoveDuplicates_80 {

    public int removeDuplicates(int[] nums) {
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (l < 2 || nums[r] != nums[l - 2]) {
                nums[l++] = nums[r];
            }
        }
        return l;
    }

//    public int removeDuplicates(int[] nums) {
//        int delete = 0;
//        int repeat = 1;
//        for (int i = 1; i < nums.length - delete; i++) {
//            if (nums[i] == nums[i - 1]) {
//                repeat++;
//            } else {
//                repeat = 1;
//            }
//            if (repeat > 2) {
//                delete++;
//                System.arraycopy(nums, i + 1, nums, i, nums.length - i - delete);
//                i--;
//            }
//        }
//        return nums.length - delete;
//    }

}
