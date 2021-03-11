package practice.leecode.Dynamic;

public class PackageQuestion {

    public static void main(String[] args) {
        int[] values = new int[]{6,3,5,4,6};
        int[] weights = new int[]{2,2,6,5,4};
        int capacity = 10;
        System.out.println(getMaxValues(values, weights, capacity));
    }

    // 打印选择了哪些物品
    public static void printChooseGoods(int[][] dp, int[] values, int[] weights, int capacity) {
        if (values == null || values.length == 0) return;
        if (weights == null || weights.length == 0) return;
        if (capacity == 0) return;
        int i = weights.length, j = capacity;
        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[i - 1][j - weights[i - 1]] + values[i - 1]) {
                System.out.println("values:" + values[i - 1] + " weights:" + weights[i - 1]);
                j -= weights[i - 1];
            }
            i--;
        }
    }

//    // 方法二: 优化空间复杂度
//    public static int getMaxValues(int[] values, int[] weights, int capacity) {
//        if (values == null || values.length == 0) return 0;
//        if (weights == null || weights.length == 0) return 0;
//        if (capacity == 0) return 0;
//        // 不选择该物品 dp(i, j) = dp(i - 1, j)
//        // 选择该物品 dp(i, j) = dp(i - 1, j - weights[i]) + values[i]
//        // 返回最大值 Math.max(dp(i - 1, j), dp(i - 1, j - weights[i]) + values[i])
//        int[] dp = new int[capacity + 1];
//        for (int i = 1; i <= values.length; i++) {
//            for (int j = capacity; j >= weights[i - 1]; j--) {
//                dp[j] = Math.max(dp[j], dp[j - weights[i - 1]] + values[i - 1]);
//            }
//        }
//        return dp[capacity];
//    }

    // 方法一
    public static int getMaxValues(int[] values, int[] weights, int capacity) {
        if (values == null || values.length == 0) return 0;
        if (weights == null || weights.length == 0) return 0;
        if (capacity == 0) return 0;
        // 不选择该物品 dp(i, j) = dp(i - 1, j)
        // 选择该物品 dp(i, j) = dp(i - 1, j - weights[i]) + values[i]
        // 返回最大值 Math.max(dp(i - 1, j), dp(i - 1, j - weights[i]) + values[i])
        int[][] dp = new int[values.length + 1][capacity + 1];
        for (int i = 1; i <= values.length; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (j < weights[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                }
            }
        }
        printChooseGoods(dp, values, weights, capacity);
        return dp[values.length][capacity];
    }

}
