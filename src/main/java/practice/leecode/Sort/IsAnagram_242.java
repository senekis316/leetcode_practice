package practice.leecode.Sort;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram_242 {

    //方法三: 数组法
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        short[] count = new short[26];
        for (int i = 0; i < s1.length; i++) {
            count[s1[i] - 'a']++;
            count[t1[i] - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    //方法二: 哈希表
    /*public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            sMap.put(s1[i], sMap.getOrDefault(s1[i], 0) + 1);
            tMap.put(t1[i], tMap.getOrDefault(t1[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry: sMap.entrySet()) {
            if (entry.getValue().intValue() != tMap.getOrDefault(entry.getKey(), 0).intValue()) {
                return false;
            }
        }
        return true;
    }*/

    //方法一: 排序
    /*public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        quick_sort(s1, 0, s1.length - 1);
        quick_sort(t1, 0, t1.length - 1);
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != t1[i]) {
                return false;
            }
        }
        return true;
    }

    private void quick_sort(char[] cs, int l, int r) {
        if (l < r) {
            int i = l, j = r, m = cs[l];
            while(i < j) {
                while(i < j && cs[j] >= m) {
                    j--;
                }
                if (i < j) {
                    cs[i++] = cs[j];
                }
                while(i < j && cs[i] < m) {
                    i++;
                }
                if (i < j) {
                    cs[j--] = cs[i];
                }
            }
            cs[i] = (char)m;
            quick_sort(cs, l, i - 1);
            quick_sort(cs, i + 1, r);
        }
    }*/

}
