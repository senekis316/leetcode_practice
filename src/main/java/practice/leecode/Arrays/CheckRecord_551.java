package practice.leecode.Arrays;

public class CheckRecord_551 {

    public boolean checkRecord(String s) {
        int a = 0, l = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                l++;
            } else {
                if (ch == 'A') {
                    a++;
                }
                l = 0;
            }
            if (a == 2 || l == 3) {
                return false;
            }
        }
        return true;
    }

}
