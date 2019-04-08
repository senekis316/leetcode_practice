package practice.leecode.BinarySearch;

public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[]{-1,-1};
        if (nums == null || nums.length == 0) return range;
        if (target < nums[0] && target > nums[nums.length - 1]) return range;
        findRangeIndex(nums, target, 0, range);
        findRangeIndex(nums, target, 1, range);
        return range;
    }

    public void findRangeIndex(int[] nums, int target, int direction, int[] range) {
        int l = 0, r = nums.length - 1;
        while(l < r) {
            int m = l + (r - l) / 2 + direction;
            if (direction == 0) {
                if (target > nums[m]) {
                    l = m + 1;
                } else {
                    r = m;
                }
            } else {
                if (target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m;
                }
            }
        }
        if (nums[l] == target) range[direction] = l;
    }



    /*public void findRangeIndex(int[] nums, int target, int direction, int[] range) {
        int l = 0, r = nums.length - 1;
        while(l < r) {
            int m = l + (r - l) / 2;
            if (direction == 0) {
                if (nums[m] == target) {
                    r = m;
                } else {
                    l = m + 1;
                }
            } else {
                if (nums[m] == target) {
                    l = m;
                } else {
                    r = m - 1;
                }
            }
        }
        if (nums[l] == target) range[direction] = l;
    }*/

    /*public int firstBadVersion(int n) {
        int l = 0, r = n;
        while(l < r) {
            int m = l + (r - l) / 2;
            if (isBadVersion(m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }*/

    /*private void findRangeIndex(int[] nums, int target, int direction, int[] range) {
        int l = 0;
        int r = nums.length;
        //int m = 0;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                if (direction < 0) {
                    r = m;
                    range[0] = m;
                } else {
                    l = m + 1;
                    range[1] = (l <= nums.length - 1 && nums[l] == target ? l : m);
                }
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
    }*/

    /*
    int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int left = 0, right = nums.length - 1;
        while (left + 1 < right){
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        // Post-processing:
        // End Condition: left + 1 == right
        if(nums[left] == target) return left;
        if(nums[right] == target) return right;
        return -1;
    }
    */

}
