package practice.leecode.Bits;

public class CountDigitOne_233 {

    public int countDigitOne(int n) {
        int ans = 0;
        int mul = 1;
        while (n >= mul) {
            ans += (n / (mul * 10)) * mul + Math.min(Math.max(n % (mul * 10) - mul + 1, 0), mul);
            mul *= 10;
        }
        return ans;
    }

}
