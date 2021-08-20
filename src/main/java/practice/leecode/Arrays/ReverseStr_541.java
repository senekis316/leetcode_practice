package practice.leecode.Arrays;

public class ReverseStr_541 {

    public String reverseStr(String s, int k) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i += 2 * k) {
            int l = i;
            int r = i + k - 1;
            if (r >= s.length() - 1) {
                r = s.length() - 1;
            }
            while (l <= r) {
                chars[l] = s.charAt(r);
                chars[r--] = s.charAt(l++);
            }
            for (int j = i + k;  j < s.length() && j < i + 2 * k; j++) {
                chars[j] = s.charAt(j);
            }
        }
        return new String(chars);
    }

}
