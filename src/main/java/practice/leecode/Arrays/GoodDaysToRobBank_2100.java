package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GoodDaysToRobBank_2100 {

//    public List<Integer> goodDaysToRobBank(int[] security, int time) {
//        if (time == 0) return IntStream.range(0, security.length).boxed().collect(Collectors.toList());
//        List<Integer> res = new ArrayList<>();
//        for (int i = time; i < security.length - time; i++) {
//            int cnt = 0;
//            for (int l = i - 1, r = i + 1;  l >= 0 && r <= security.length && l >= i - time && r <= i + time; l--, r++) {
//                if (security[l] >= security[l + 1] && security[r - 1] <= security[r]) {
//                    cnt++;
//                    if (cnt >= time) {
//                        res.add(i);
//                        break;
//                    }
//                } else {
//                    break;
//                }
//            }
//        }
//        return res;
//    }

    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> res = new ArrayList<>();
        if (time == 0) {
            for (int i = 0; i < security.length; i++) {
                res.add(i);
            }
            return res;
        }
        int[] pre = new int[security.length];
        int[] suf = new int[security.length];
        Arrays.fill(pre, -1);
        Arrays.fill(suf, -1);
        for (int i = time; i < security.length - time; i++) {
            if (pre[i - 1] == -1) {
                pre[i] = 0;
                for (int j = i; j > 0; j--) {
                    if (security[j] > security[j - 1]) {
                        break;
                    }
                    pre[i]++;
                }
            } else if (security[i] > security[i - 1]) {
                pre[i] = 0;
            } else {
                pre[i] = pre[i - 1] + 1;
            }

            if (pre[i] < time) {
                continue;
            }

            if (suf[i - 1] == -1 || suf[i - 1] == 0) {
                suf[i] = 0;
                for (int j = i; j < security.length - 1; j++) {
                    if (security[j] > security[j + 1]) {
                        break;
                    }
                    suf[i]++;
                }
            } else {
                suf[i] = suf[i - 1] - 1;
            }

            if (pre[i] >= time && suf[i] >= time) {
                res.add(i);
            }
        }
        return res;
    }
}
