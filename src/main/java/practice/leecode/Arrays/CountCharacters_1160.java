package practice.leecode.Arrays;

public class CountCharacters_1160 {

    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        int[] table = countCharacters(chars);
        for (int i = 0; i < words.length; i++) {
            if (canSpell(table, words[i])) {
                sum += words[i].length();
            }
        }
        return sum;
    }

    private int[] countCharacters(String word) {
        int[] count = new int[26];
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            count[chars[i] - 'a']++;
        }
        return count;
    }

    private boolean canSpell(int[] table, String word) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            if (count[pos] == table[pos]) {
                return false;
            }
            count[pos]++;
        }
        return true;
    }

}
