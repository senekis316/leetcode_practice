package practice.leecode;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic_205 {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> leftToRightMap = new HashMap<>();
        Map<Character, Character> rightToLeftMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (leftToRightMap.get(s1) != null && !leftToRightMap.get(s1).equals(t1)) {
                return false;
            }
            if (rightToLeftMap.get(t1) != null && !rightToLeftMap.get(t1).equals(s1)) {
                return false;
            }
            leftToRightMap.put(s1, t1);
            rightToLeftMap.put(t1, s1);
        }
        return true;
    }

}
