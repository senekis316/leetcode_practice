package practice.leecode.Dynamic;

public class GetMoneyAmount_375 {

    public int getMoneyAmount(int n) {
        return getMoneyAmount(1, n);
    }

    private int getMoneyAmount(int l, int r) {
        if (l >= r) {
            return 0;
        } else {
            int m = (l + r) / 2;
            return m + getMoneyAmount(m + 1, r);
        }
    }

}
