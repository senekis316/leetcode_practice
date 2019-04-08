package practice.leecode.BinarySearch;

public class BinarySearch {

    public int search(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;

        int left = 0, right = nums.length - 1;
        while(left <= right){
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) { left = mid + 1; }
            else { right = mid - 1; }
        }

        // End Condition: left > right
        return -1;

    }

    /*public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (end > start) {
            int mid = start + ((end - start) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }*/


    /*public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int begin, int end, int target) {

        int medium = (end + begin) / 2;

        int differ = nums[medium] - target;

        if (differ == 0) {
            return medium;
        }

        if (Math.abs(differ) > 16) {
            return differ > 0 ? search(nums, begin, medium, target) : search(nums, medium, end, target);
        } else {
            begin = differ > 0 ? begin : medium;
            end = differ > 0 ? medium : end;
            for (int i = begin; i <= end; i++) {
                if (nums[i]==target) return i;
            }
        }

        return -1;

    }*/


}
