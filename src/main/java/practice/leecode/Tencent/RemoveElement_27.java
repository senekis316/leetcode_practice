package practice.leecode.Tencent;

public class RemoveElement_27 {

    public int removeElement(int[] nums, int val) {
        int remove = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                remove++;
            } else {
                nums[i - remove] = nums[i];
            }
        }
        return nums.length - remove;
    }

}