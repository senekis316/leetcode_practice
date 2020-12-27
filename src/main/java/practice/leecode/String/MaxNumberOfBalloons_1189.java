package practice.leecode.String;

public class MaxNumberOfBalloons_1189 {

    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26];
        for (char ch : text.toCharArray()) {
            chars[ch - 'a']++;
        }
        chars['l' - 'a'] /= 2;
        chars['o' - 'a'] /= 2;
        int min = Integer.MAX_VALUE;
        for (char ch : "balon".toCharArray()) {
            min = Math.min(min, chars[ch - 'a']);
        }
        return min;
    }


}
