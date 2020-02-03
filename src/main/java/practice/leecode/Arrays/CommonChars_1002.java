package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonChars_1002 {

    public List<String> commonChars(String[] strings) {
        short[] res = count(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            merge(res, count(strings[i]));
        }
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i]; j++) {
                arr.add(String.valueOf((char)(i + 'a')));
            }
        }
        return arr;
    }

    private short[] count(String string) {
        short[] count = new short[26];
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            count[ch-'a']++;
        }
        return count;
    }

    private void merge(short[] source, short[] target) {
        for (int i = 0; i < target.length; i++) {
            if (source[i] > target[i]) {
                source[i] = target[i];
            }
        }
    }

    /*public List<String> commonChars(String[] strs) {
        List<String> strings = new ArrayList<>();
        String[] chars = strs[0].split("");
        for (int i = 0; i < chars.length; i++) {
            boolean exist = true;
            for (int j = 1; j < strs.length && exist; j++) {
                int length = strs[j].length();
                strs[j] = strs[j].replaceFirst(chars[i], "");
                if (strs[j].length() == length) {
                    exist = false;
                    break;
                }
            }
            if (exist) {
                strings.add(chars[i]);
            }
        }
        return strings;
    }*/

}
