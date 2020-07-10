package practice.leecode.Pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching_16_18 {

    public boolean patternMatching(String pattern, String value) {

        List<Character> chars = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : pattern.toCharArray()) {
            if (!chars.contains(ch)) {
                chars.add(ch);
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        if (chars.size() == 0 && value.length() == 0) {
            return true;
        }

        if (chars.size() == 0 && value.length() > 0) {
            return false;
        }

        if (chars.size() == 1 && value.length() == 0) {
            return true;
        }

        for (int i = 0; i < value.length(); i++) {
            String prev = value.substring(0, i);
            Matcher matcher = Pattern.compile(prev).matcher(value);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            if (map.get(chars.get(0)) != count) {
                continue;
            }
            String curr = value.replaceAll(prev, "");
            if (chars.size() == 1 && curr.length() == 0 && count == map.get(chars.get(0)) ) {
                return true;
            } else if (chars.size() == 2) {
                //int leng(value.length() - prev.length() * count) / (pattern.length() - count);
                String next = curr.substring(0, curr.length() / map.get(chars.get(1)));
                matcher = Pattern.compile(next).matcher(curr);
                count = 0;
                while (matcher.find()) {
                    count++;
                }
                if (count == map.get(chars.get(1)) && curr.replaceAll(next, "").length() == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    /*public boolean patternMatching(String pattern, String value) {

        if (pattern.equals("") && !value.equals("")) return false;

        int p = 1;
        int v = 1;

        char[] pChars = pattern.toCharArray();
        char[] vChars = value.toCharArray();

        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < pChars.length; i++) {
            if (!set1.contains(pChars[i])) {
                p++;
                set1.add(pChars[i]);
            }
        }

        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < vChars.length; i++) {
            if (!set2.contains(vChars[i])) {
                v++;
                set2.add(vChars[i]);
            }
        }

        if (Math.abs(p - v) <= 1) {
            return true;
        }

        int[] counts = new int[2];
        char[] chars = new char[2];
        if (pattern.charAt(0) == 'a') {
            chars[0] = 'a';
            chars[1] = 'b';
        } else {
            chars[0] = 'b';
            chars[1] = 'a';
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == chars[0]) {
                counts[0]++;
            } else {
                counts[1]++;
            }
        }
        for (int i = 1; i < value.length(); i++) {
            String prev = value.substring(0, i);
            Matcher matcher = Pattern.compile(prev).matcher(value);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            if (count == counts[0] + counts[1] && value.replaceAll(prev, "").length() == 0) {
                return true;
            }
            if (count == counts[0] && counts[1] != 0) {
                String curr = value.replaceAll(prev, "");
                String next = curr.substring(0, curr.length() / counts[1]);
                matcher = Pattern.compile(next).matcher(curr);
                count = 0;
                while (matcher.find()) {
                    count++;
                }
                if (count == counts[1] && curr.replaceAll(next, "").length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }*/

}
