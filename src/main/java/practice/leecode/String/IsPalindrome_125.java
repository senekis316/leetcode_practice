package practice.leecode.String;

public class IsPalindrome_125 {

    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            while (i <= j && !isNumberOrAlphabet(chars[i])) {
                i++;
            }
            while (i <= j && !isNumberOrAlphabet(chars[j])) {
                j--;
            }
            if (i <= j && chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumberOrAlphabet(char ch) {
        return (ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122);
    }

}
