package practice.leecode.Arrays;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseParentheses_1190 {

    public String reverseParentheses(String s) {
        int n = s.length();
        int[] pair = new int[n];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        int idx = 0, direct = 1;
        StringBuilder sb = new StringBuilder();
        while (idx < n) {
            if (s.charAt(idx) == '(' || s.charAt(idx) == ')') {
                idx = pair[idx];
                direct = -direct;
            } else {
                sb.append(s.charAt(idx));
            }
            idx += direct;
        }
        return sb.toString();
    }

}
