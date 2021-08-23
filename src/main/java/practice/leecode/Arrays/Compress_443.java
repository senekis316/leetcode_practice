package practice.leecode.Arrays;

public class Compress_443 {

    public int compress(char[] chars) {
        if (chars.length <= 1) return chars.length;
        int len = 1;
        int idx = 0;
        char prev = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                len++;
            } else {
                chars[idx++] = chars[i - 1];
                if (len > 1) {
                    for (char ch : String.valueOf(len).toCharArray()) {
                        chars[idx++] = ch;
                    }
                }
                len = 1;
                prev = chars[i];
            }
        }
        chars[idx++] = chars[chars.length - 1];
        if (len > 1) {
            for (char ch : String.valueOf(len).toCharArray()) {
                chars[idx++] = ch;
            }
        }
        return idx;
    }

}
