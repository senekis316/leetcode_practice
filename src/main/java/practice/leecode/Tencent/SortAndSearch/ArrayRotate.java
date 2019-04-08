package practice.leecode.Tencent.SortAndSearch;

public class ArrayRotate {

    public int search(int[] nums, int target) {

        for (int i=0, j=nums.length - 1; i <= j; i++, j--) {

            if (nums[i] > target && nums[j] < target) {
                break;
            }

            if (nums[i] == target) {
                return i;
            }

            if (nums[j] == target) {
                return j;
            }

        }

        return -1;

    }

    /*public int search(int[] nums, int target) {
        for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
            if (nums[i] > target && nums[j] < target) {
                break;
            }

            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                i--;
            }

            if (nums[j] == target) {
                return j;
            } else if (nums[j] < target) {
                j++;
            }
        }
        return -1;
    }*/

    /*public int search(int[] nums, int target) {

        if (nums.length >= 1) {

            if (target <= nums[nums.length - 1]) {
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == target) return i;
                    if (i-1>=0 && nums[i] < nums[i - 1]) break;
                }
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == target) return i;
                    if (i+1<=nums.length-1 && nums[i] > nums[i + 1]) break;
                }
            }

        }

        return -1;

    }*/

}
