package practice.leecode.Tencent.MathAndNumber;


public class MajorityElement {

    public int majorityElement(int[] nums) {

        int major = nums[0], count = 0;
        int most = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                major = nums[i];
                count++;
            } else if (nums[i] == major) {
                count++;
            } else {
                count--;
            }

            if (most < count) {
                return major;
            }

        }

        return major;

    }

    /*public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int majority = 0;

        for (int i = 0; i < nums.length; i++) {
            Integer count = map.get(nums[i]);
            if (count == null) {
                count = 1;
                map.put(nums[i], count);
            } else {
                map.put(nums[i], ++count);
            }
            if (count > nums.length / 2) {
                majority = nums[i];
                break;
            }
        }

        return majority;

    }*/

}
