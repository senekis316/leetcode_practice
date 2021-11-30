package practice.leecode.Arrays;

public class FindNthDigit_400 {

    public int findNthDigit(int n) {
        int b = 1, m = 9;
        while (n > (long) b * m) {
            n -= b * m;
            b++;
            m *= 10;
        }
        int start = (int) Math.pow(10, b - 1);
        int end = start + (n - 1) / b;
        char[] chars = String.valueOf(end).toCharArray();
        return chars[(n - 1) % b] - '0';
    }

}
