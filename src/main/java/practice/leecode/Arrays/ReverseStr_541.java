package practice.leecode.Arrays;

public class ReverseStr_541 {

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int l = i;
            int r = i + k - 1;
            if (r >= s.length() - 1) {
                r = s.length() - 1;
            }
            while (l <= r) {
                char tmp = chars[l];
                chars[l++] = chars[r];
                chars[r--] = tmp;
            }
        }
        return new String(chars);
    }

}
