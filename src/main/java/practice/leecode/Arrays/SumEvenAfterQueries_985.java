package practice.leecode.Arrays;

public class SumEvenAfterQueries_985 {


    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sum += A[i];
            }
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            if (A[index] % 2 == 0) sum -= A[index];
            A[index] += val;
            if (A[index] % 2 == 0) sum += A[index];
            res[i] = sum;
        }
        return res;
    }

    //方法1:
    /*public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sum += A[i];
            }
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int num1 = A[queries[i][1]];
            int num2 = queries[i][0];
            if (num1 % 2 != 0 && num2 % 2 != 0) {
                sum += num1 + num2;
            } else if (num1 % 2 == 0) {
                sum += num2 % 2 == 0 ? num2 : -num1;
            }
            A[queries[i][1]] += queries[i][0];
            res[i] = sum;
        }
        return res;
    }*/

}
