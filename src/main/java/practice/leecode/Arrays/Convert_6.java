package practice.leecode.Arrays;

public class Convert_6 {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int interval = (numRows - 2) * 2 + 2;
        for (int i = 0; i < chars.length; i += interval) {
            sb.append(chars[i]);
        }
        for (int c = 0; c < numRows - 2; c++) {
            for (int i = 1, j = interval - 1; i < chars.length || j < chars.length; i += interval, j += interval) {
                if (i != j) {
                    if (i + c < chars.length) {
                        sb.append(chars[i + c]);
                    }
                    if (j - c < chars.length) {
                        sb.append(chars[j - c]);
                    }
                }
            }
        }
        for (int i = numRows - 1; i < chars.length; i += interval) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
