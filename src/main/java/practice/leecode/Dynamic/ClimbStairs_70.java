package practice.leecode.Dynamic;

public class ClimbStairs_70 {

    // 方法二: 黄金分割求斐波那契数列
    public int climbStairs(int n) {
        return (int)((Math.pow((1 + Math.sqrt(5)) / 2, n + 1) - Math.pow((1 - Math.sqrt(5)) / 2, n + 1)) / Math.sqrt(5));
    }

//    方法一: 正常迭代
//    public int climbStairs(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return climbStairs(n - 1) + climbStairs( n - 2);
//    }

}
