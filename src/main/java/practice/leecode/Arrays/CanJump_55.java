package practice.leecode.Arrays;

public class CanJump_55 {

    // 方法2: 反向
    public boolean canJump(int[] nums) {
       int before = nums.length - 1;
       for (int i = before - 1; i >= 0; i--) {
           before = nums[i] + i >= before ? i : before;
       }
       return before == 0;
    }


//    方法1: 正向
//    public boolean canJump(int[] nums) {
//        int reach = 0;
//        int target = nums.length - 1;
//        for (int i = 0; i <= reach && reach < target; i++) {
//            reach = Math.max(reach, i + nums[i]);
//        }
//        return reach >= target;
//    }

}
