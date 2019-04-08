package practice.leecode.Tencent;

public class ClimbStairs {


    public int climbStairs(int n) {
        if (n <= 0) return 0;
        return (n == 1 || n == 2) ? n : climbStairs(n - 1) + climbStairs(n - 2);
    };

}
