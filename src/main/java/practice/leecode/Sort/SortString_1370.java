package practice.leecode.Sort;

public class SortString_1370 {

    public String sortString(String s) {
        int length = 0;
        int[] counts = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            counts[(int)c - 97] += 1;
        }
        StringBuilder sb = new StringBuilder();
        while (s.length() > length) {
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > 0) {
                    sb.append((char)(i + 97));
                    counts[i]--;
                    length++;
                }
            }
            for (int i = counts.length - 1; i >= 0; i--) {
                if (counts[i] > 0) {
                    sb.append((char)(i + 97));
                    counts[i]--;
                    length++;
                }
            }
        }
        return sb.toString();
    }

}
