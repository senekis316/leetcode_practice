package practice.leecode.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FindWords_500 {

    private static Map<Character, Integer> maps;

    static {
        char[] one = "qwertyuiopQWERTYUIOP".toCharArray();
        char[] two = "asdfghjklASDFGHJKL".toCharArray();
        char[] third = "zxcvbnmZXCVBNM".toCharArray();
        maps = new HashMap<>();
        for(char c: one) {
            maps.put(c, 1);
        }
        for(char c: two) {
            maps.put(c, 2);
        }
        for(char c: third) {
            maps.put(c, 3);
        }
    }

    public String[] findWords(String[] words) {
        List<String> equalLineWords = new ArrayList<>();
        for(String word: words) {
            char[] chars = word.toCharArray();
            int first = maps.get(chars[0]);
            boolean equalLine = true;
            for (int i = 1; i < chars.length; i++) {
                if (maps.get(chars[i]) != first) {
                    equalLine = false;
                    break;
                }
            }
            if (equalLine) {
                equalLineWords.add(word);
            }
        }
        String[] res = new String[equalLineWords.size()];
        for (int i = 0; i < equalLineWords.size(); i++) {
            res[i] = equalLineWords.get(i);
        }
        return res;
    }

}
