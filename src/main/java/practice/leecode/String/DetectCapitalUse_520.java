package practice.leecode.String;

public class DetectCapitalUse_520 {

    public boolean detectCapitalUse(String word) {
        int N = word.length();
        if (N < 2) return true;
        if (word.charAt(0) - 'a' < 26 && word.charAt(0) - 'a' >= 0) {
            for (int i = 1; i < N; i ++) {
                if (word.charAt(i) - 'a' >= 26 || word.charAt(i) - 'a' < 0) return false;
            }
            return true;
        }
        if (word.charAt(1) - 'A' < 26 && word.charAt(1) - 'A' >= 0) {
            for (int i = 2; i < N; i ++) {
                if (word.charAt(i) - 'A' >= 26 || word.charAt(i) - 'A' < 0) return false;
            }
            return true;
        }
        for (int i = 2; i < N; i ++) {
            if (word.charAt(i) - 'a' >= 26 || word.charAt(i) - 'a' < 0) return false;
        }
        return true;
    }

}
