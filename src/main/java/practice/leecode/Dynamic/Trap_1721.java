package practice.leecode.Dynamic;

public class Trap_1721 {

//    public int trap(int[] height) {
//        int leftMax = 0, rightMax = 0, level = 0;
//        for (int l = 0, r = height.length - 1; l <= r;) {
//            leftMax = Math.max(leftMax, height[l]);
//            rightMax = Math.max(leftMax, height[r]);
//            level = Math.min(leftMax, rightMax);
//
//
//        }
//
//    }

    public int trap(int[] height) {
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += height[i];
        }
        while (sum > 0) {
            int l = -1;
            int r = -1;
            for (int i = 1; i < height.length - 1; i++) {
                if (height[i] == 0 && height[i - 1] != 0 && l == -1) {
                    l  = i - 1;
                }
                if (height[i] == 0 && height[i + 1] != 0 && l != -1) {
                    r = i + 1;
                }
                if (l != -1 && r != -1) {
                    for (int z = l; z < r; z++) {
                        if (height[z] == 0) {
                            ans++;
                        }
                    }
                    l = -1;
                    r = -1;
                }
            }
            for (int i = 0; i < height.length; i++) {
                if (height[i] > 0) {
                    height[i]--;
                    sum--;
                }
            }
        }
        return ans;
    }

}
