package practice.leecode.String;

public class CharacterReplacement_424 {

    public int characterReplacement(String s, int k) {
        int[] num = new int[26];
        int max = 0;
        char[] chars = s.toCharArray();
        int l, r;
        for (l = 0, r = 0; r < chars.length; r++) {
            int idx = chars[r] - 'A';
            num[idx]++;
            max = Math.max(max, num[idx]);
            if (max + k < r - l + 1) {
                num[chars[l] - 'A']--;
                l++;
            }
        }
        return r - l;
    }

}
