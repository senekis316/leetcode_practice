package practice.leecode.Dynamic;

public class CoinChange_322 {

    public int coinChange(int[] coins, int amount) {
        int min = 0;
        int sum = 0;
        for (int i = coins.length - 1; i >= 0;) {
            if (sum + coins[i] == amount) {
                return min + 1;
            }
        }
        return -1;
    }

}
