package practice.leecode.Tencent;

public class RegexMatch_10 {

    public boolean isMatch(String s, String p) {

        char[] sc = s.toCharArray();
        char[] pc = p.toCharArray()[0] == '*' ? ("." + p).toCharArray() : p.toCharArray();

        int i = 0, j = 0, match_length = 0;

        while (i < sc.length) {

            if (sc[i] == pc[j] || pc[j] == '.') {
                j++;
                match_length++;
            } else if (pc[j] == '*') {
                if (j == 0 || pc[j-1] == '.' || sc[i] == pc[j-1]) {
                    match_length++;
                } else {
                    i-=1;
                    j++;
                }
            } else if (j + 1 < pc.length && pc[j + 1] == '*'){
                j+=2;
                i-=1;
            }

            if (j >= pc.length) {
                break;
            }

            i++;

        }

        return match_length == sc.length;

    }

}
