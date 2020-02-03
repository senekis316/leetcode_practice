package practice.leecode;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic_205 {

    public boolean isIsomorphic(String s, String t) {
        Map<String, String> leftToRightMap = new HashMap<>();
        Map<String, String> rightToLeftMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            String t1 = String.valueOf(t.charAt(i));
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
