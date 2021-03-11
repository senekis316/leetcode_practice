package practice.leecode.Window;


public class MinWindow_76 {

    public String minWindow(String s, String t) {
        int[] obj = new int[123];
        int[] cnt = new int[123];
        int minLen = Integer.MAX_VALUE;
        for (char ch : t.toCharArray()) {
            obj[ch]++;
        }
        int l = 0, r = 0;
        int found = 0, start = 0;
        while (r < s.length()) {
            while (found < t.length() && r < s.length()) {
                int idx = s.charAt(r++);
                if (obj[idx] > 0 && obj[idx] >= ++cnt[idx]) {
                    found++;
                }
            }
            while (found == t.length()) {
                if (minLen > r - l) {
                    start = l;
                    minLen = r - l;
                }
                int idx = s.charAt(l++);
                if (obj[idx] > 0 && obj[idx] > --cnt[idx]) {
                    found--;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

//    public String minWindow(String s, String t) {
//        int min = Integer.MAX_VALUE;
//        int minL = 0;
//        int[] obj = new int[52];
//        int[] cnt = new int[52];
//        for (char ch : t.toCharArray()) {
//            obj[idx(ch)]++;
//        }
//        int l = 0, r = 0;
//        while (r < s.length()) {
//            int rIdx = idx(s, r);
//            if (obj[rIdx] > 0) {
//                cnt[rIdx]++;
//            }
//            if (match(obj, cnt) >= 0) {
//                while (l < r) {
//                    int lIdx = idx(s, l);
//                    if (obj[lIdx] > 0 && cnt[lIdx] > obj[lIdx]) {
//                        cnt[lIdx]--;
//                        l++;
//                    } else {
//                        if (obj[lIdx] == 0) {
//                            l++;
//                        } else {
//                            break;
//                        }
//                    }
//                }
//                int len = r - l + 1;
//                if (len == t.length()) {
//                    return s.substring(l, r + 1);
//                }
//                if (min > len) {
//                    min = Math.min(min, len);
//                    minL = l;
//                }
//            }
//            r++;
//        }
//        return minL + min <= s.length() ? s.substring(minL, minL + min) : "";
//    }

//    private int match(int[] obj, int[] cnt) {
//        boolean eq = true;
//        for (int i = 0; i < obj.length; i++) {
//            if (obj[i] > cnt[i]) {
//                return -1;
//            }
//            if (cnt[i] > obj[i]) {
//                eq = false;
//            }
//        }
//        return eq ? 1 : 0;
//    }
//
//    private int idx(String s, int pos) {
//        return idx(s.charAt(pos));
//    }
//
//    private int idx(char ch) {
//        return ch >= 97 ? ch - 97 : ch - 56;
//    }

}
