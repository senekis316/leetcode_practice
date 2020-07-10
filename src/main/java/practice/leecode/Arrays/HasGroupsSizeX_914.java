package practice.leecode.Arrays;

public class HasGroupsSizeX_914 {

    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int i = 0; i < deck.length; i++) {
            count[deck[i]]++;
        }
        int gcd = -1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                if (gcd == -1) {
                    gcd = count[i];
                } else {
                    gcd = getGcd(gcd, count[i]);
                }
                if (gcd == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private int getGcd(int x, int y) {
        return y == 0 ? x : getGcd(y,x % y);
    }

    /*private int getGcd(int num1, int num2) {
        while (true) {
            if (num1 % num2 == 0) {
                return num2;
            } else {
                int tmp = num1;
                num1 = num2;
                num2 = tmp % num2;
            }
        }
    }*/

    /*public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int i = 0; i < deck.length; i++) {
            count[deck[i]]++;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                min = min <= count[i] ? min : count[i];
            }
        }
        if (min < 2) {
            return false;
        }
        int noZero = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
        }
        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] != 0) {
                int gcd = getGreatestCommonDivisor(count[i], count[i + 1]);
                min = min < gcd
            }
        }
        for (int i = 0; i < deck.length; i++) {
            if (count[i] != 0) {
                int mod = count[i] % min;
                if (mod != 0) {
                    if (mod == 1 || min % mod != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }*/

}
