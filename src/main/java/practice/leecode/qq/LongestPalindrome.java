package practice.leecode.qq;


public class LongestPalindrome {

    public String longestPalindrome(String s) {

        if (s==null || s.length()==0) return s;

        String[] strs = getHandleStrings(s);

        int[] pos = new int[strs.length];

        int center = 0, right = 0;

        for (int i=1; i<strs.length-1; i++) {

            //1.确定最小P[i]
            if (right > i) {
                int mirror = pos[center - (i - center)];
                int expand = right - i;
                pos[i] = Math.min(mirror, expand);
                //
            } else {
                pos[i] = 0;
            }

            //2.增长P[i]到最大
            while((i - 1 - pos[i]) > -1  && i + 1 + pos[i] < strs.length && strs[i - 1 - pos[i]].equals(strs[i + 1 + pos[i]])) {
                pos[i]++;
            }

            //3.更新cr
            if (right < i + pos[i]) {
                right = i + pos[i];
                center = i;
            }

        }

        return getLongestPalindrome(strs, pos);
    }

    private String[] getHandleStrings(String s) {

        String[] strs = s.split("");

        StringBuilder sb = new StringBuilder('#');
        for (int i = 0; i < strs.length; i++) {
            sb.append('#' + strs[i]);
        }

        sb.append('#');

        return sb.toString().split("");

    }

    private String getLongestPalindrome(String[] strs , int[] pos) {

        int max = 0;
        int max_index = 0;

        for (int i=0; i<pos.length; i++) {
            if (pos[i] > max) {
                max = pos[i];
                max_index = i;
            }
        }

        StringBuilder sb = new StringBuilder();

        int radius = max;
        int begin = max_index - radius;
        int end = max_index + radius;

        for (int i = begin; i <= end; i++) {
            sb.append(strs[i]);
        }

        return sb.toString().replace("#","");

    }



}
