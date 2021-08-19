package practice.leecode.Arrays;

public class ReverseVowels_345 {

    public boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? true : false;
    }

    public String reverseVowels(String s) {
        if (s == null) return null;
        char[] chs = new char[s.length()];
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            char chi = s.charAt(i);
            char chj = s.charAt(j);
            if (!isVowel(chi)) {
                chs[i++] = chi;
            } else if (!isVowel(chj)) {
                chs[j--] = chj;
            } else {
                chs[i++] = chj;
                chs[j--] = chi;
            }
        }
        return new String(chs);
    }

}
