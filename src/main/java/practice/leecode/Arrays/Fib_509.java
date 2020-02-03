package practice.leecode.Arrays;

public class Fib_509 {

    //数学方法，通过黄金比率和斐波那契数列的关系来计算，时间复杂度和空间复杂度都是O(1);
    public int fib(int n) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return (int)Math.round(Math.pow(goldenRatio, n) / Math.sqrt(5));
    }

    /*public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }*/

}
