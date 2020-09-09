package practice.leecode.HashMap;

public class TitleToNumber_171 {

    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int res = 0;
        int num = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            res += num * (c - 'A' + 1);
            num *= 26;
        }
        return res;
    }

}
