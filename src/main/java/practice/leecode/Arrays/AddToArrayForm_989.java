package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AddToArrayForm_989 {

    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> result = new LinkedList<>();
        int length = String.valueOf(K).length();
        int[] B = new int[length];
        while (K > 0) {
            B[--length] = K % 10;
            K = K / 10;
        }
        int max_len = Math.max(A.length, B.length);
        int over = 0;
        for (int i = 0; i < max_len; i++) {
            int a = A.length - i - 1 >= 0 ? A[A.length - i - 1] : 0;
            int b = B.length - i - 1 >= 0 ? B[B.length - i - 1] : 0;
            int sum = a + b + over;
            over = sum >= 10 ? 1 : 0;
            result.add(0, sum >= 10 ? sum - 10 : sum);
        }
        if (over == 1) {
            result.add(0, 1);
        }
        return result;
    }

}
