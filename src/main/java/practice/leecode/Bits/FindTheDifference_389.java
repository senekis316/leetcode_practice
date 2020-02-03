package practice.leecode.Bits;

public class FindTheDifference_389 {

    public char findTheDifference(String s, String t) {
        char result = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i) ^ t.charAt(i);
        }
        return result;
    }

}
