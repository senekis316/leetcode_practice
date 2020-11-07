package practice.leecode.Math;

public class CountNumbersWithUniqueDigits_357 {

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10;
        }
        int sum = 9;
        for (int i = 1; i < n; i++) {
            sum *= 10 - i;
        }
        return sum + countNumbersWithUniqueDigits(n - 1);
    }

}
