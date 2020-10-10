package practice.leecode.String;

public class CountAndSay_38 {

    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            int count = 1;
            StringBuilder sb = new StringBuilder();
            char[] chars = s.toCharArray();
            for (int j = 1; j < chars.length; j++) {
                if (chars[j - 1] == chars[j]) {
                    count++;
                } else {
                    sb.append("" + count + (chars[j - 1] - 48));
                    count = 1;
                }
            }
            if (count != 0) {
                sb.append("" + count + (chars[chars.length - 1] - 48));
            } else {
                sb.append("1" + (chars[chars.length - 1] - 48));
            }
            s = sb.toString();
        }
        return s;
    }

}
