package practice.leecode.Arrays;

public class StrStr_28 {

    //KMP算法
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        int[] next = getPrefixTable(needle);
        for (int i = 0, j = 0; i < haystack.length() && j < needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else if (j > i) {
                i--;
                j = next[j - 1];
            }
            if (j == needle.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }

    // 计算前缀表 aabaaf
    public int[] getPrefixTable(String pattern) {
        int j = 0;
        int[] next = new int[pattern.length()];
        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = next[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }


//    public int strStr(String haystack, String needle) {
//        if (needle == null || needle.length() == 0) return 0;
//        for (int i = 0, j = 0; i < haystack.length(); i++) {
//            if (haystack.charAt(i) == needle.charAt(j)) {
//                j++;
//            } else {
//                i -= j;
//                j = 0;
//            }
//            if (j == needle.length()) {
//                return i - j + 1;
//            }
//        }
//        return -1;
//    }
}
