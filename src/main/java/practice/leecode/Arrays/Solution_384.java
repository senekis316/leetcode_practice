package practice.leecode.Arrays;

import java.util.*;

public class Solution_384 {

    private int[] nums;
    private int[] orig;
    private Random random;

    public Solution_384(int[] nums) {
        this.nums = nums;
        this.orig = Arrays.copyOf(nums, nums.length);
        this.random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return orig;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < nums.length / 2; i++) {
            int randomInt = random.nextInt(nums.length);
            int temp = nums[i];
            nums[i] = nums[randomInt];
            nums[randomInt] = temp;
        }
        return nums;
    }


//    private int[] nums;
//    private Random random;
//    private List<Integer> list;
//
//    public Solution_384(int[] nums) {
//        this.nums = nums;
//        this.random = new Random();
//        this.list = new ArrayList<>();
//    }
//
//    /** Resets the array to its original configuration and return it. */
//    public int[] reset() {
//        return nums;
//    }
//
//    /** Returns a random shuffling of the array. */
//    public int[] shuffle() {
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
//        int[] nums = new int[list.size()];
//        for (int i = 0; i < nums.length; i++) {
//            int randomInt = random.nextInt(list.size());
//            nums[i] = list.get(randomInt);
//            list.remove(randomInt);
//        }
//        return nums;
//    }

}
