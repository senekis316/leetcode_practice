package practice.leecode.Arrays;

public class XorQueries_1310 {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix_xor = new int[arr.length];
        prefix_xor[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix_xor[i] = prefix_xor[i - 1] ^ arr[i];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) {
                result[i] = prefix_xor[queries[i][1]];
            } else {
                result[i] = prefix_xor[queries[i][0] - 1] ^ prefix_xor[queries[i][1]];
            }
        }
        return result;
    }

}
