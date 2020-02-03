package practice.alibaba;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt_13 {

    public static Map<String, Integer> romanMap;

    static {
        romanMap = new HashMap<String, Integer>();
        romanMap.put("I", 1);
        romanMap.put("IV", 4);
        romanMap.put("V", 5);
        romanMap.put("IX", 9);
        romanMap.put("X", 10);
        romanMap.put("XL", 40);
        romanMap.put("L", 50);
        romanMap.put("XC", 90);
        romanMap.put("C", 100);
        romanMap.put("CD", 400);
        romanMap.put("D", 500);
        romanMap.put("CM", 900);
        romanMap.put("M", 1000);
    }

    public int romanToInt(String s) {
        int and = 0;
        for (int i = 0; i < s.length();) {
            if (i + 1 < s.length() && romanMap.containsKey(s.substring(i, i+2))) {
                and += romanMap.get(s.substring(i, i + 2));
                i += 2;
            } else {
                and += romanMap.get(s.substring(i, i + 1));
                i++;
            }
        }
        return and;
    }

}
