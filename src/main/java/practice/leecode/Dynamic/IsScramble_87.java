package practice.leecode.Dynamic;

import java.util.*;

public class IsScramble_87 {

    Map<String, Map<String, Boolean>> map = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (s1.length() != s2.length()) return false;
        if (map.containsKey(s1) && map.get(s1).containsKey(s2)) return map.get(s1).get(s2);
        if (!equals(s1, s2)) return false;
        if (s1.length() <= 3) return true;
        for (int i = 1; i < s1.length(); i++) {
            String l1 = s1.substring(0, i);
            String l2 = s2.substring(0, i);
            String l3 = s2.substring(s1.length() - i);
            String r1 = s1.substring(i);
            String r2 = s2.substring(i);
            String r3 = s2.substring(0, s1.length() - i);
            if (isScramble(l1, l2) && isScramble(r1, r2) || isScramble(l1, l3) && isScramble(r1, r3)) {
                map.computeIfAbsent(s1, z -> new HashMap<>()).put(s2, true);
                return true;
            }
        }
        map.computeIfAbsent(s1, z -> new HashMap<>()).put(s2, false);
        return false;
    }

    private boolean equals(String s1, String s2) {
        int res = 0;
        for (int i = 0; i < s1.length(); i++) {
            res += 1 << s1.charAt(i) - 'a';
            res -= 1 << s2.charAt(i) - 'a';
        }
        return res == 0;
    }
















//    Map<String, Map<String, Boolean>> map = new HashMap<>();
//
//    public boolean isScramble(String s1, String s2) {
//        if (s1.equals(s2)) return true;
//        if (!equals(s1, s2)) return false;
//        if (s1.length() <= 3) return true;
//        if (map.containsKey(s1) && map.get(s1).containsKey(s2)) return map.get(s1).get(s2);
//        for (int i = 1; i < s1.length(); i++) {
//            String l1 = s1.substring(0, i);
//            String l2 = s2.substring(0, i);
//            String l3 = s2.substring(s1.length() - i);
//            String r1 = s1.substring(i);
//            String r2 = s2.substring(i);
//            String r3 = s2.substring(0, s1.length() - i);
//            if (isScramble(l1, l2) && isScramble(r1, r2) || isScramble(l1, l3) && isScramble(r1, r3)) {
//                map.computeIfAbsent(s1, z -> new HashMap<>()).put(s2, true);
//                return true;
//            }
//        }
//        map.computeIfAbsent(s1, z -> new HashMap<>()).put(s2, false);
//        return false;
//    }
//
//    private boolean equals(String s1, String s2) {
//        int res = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            res += 1 << s1.charAt(i) - 'a';
//            res -= 1 << s2.charAt(i) - 'a';
//        }
//        return res == 0;
//    }

//    private Map<String, Map<String, Boolean>> map = new HashMap<>();
//
//    public boolean isScramble(String s1, String s2) {
//        if (map.containsKey(s1) && map.get(s1).containsKey(s2)) return map.get(s1).get(s2);
//        if (s1.length() != s2.length()) return false;
//        if (s1.equals(s2)) return true;
//        //if (hashCode(s1) != hashCode(s2)) return false;
//        if (!equals(s1, s2)) return false;
//        if (s1.length() <= 3) return true;
//        for (int i = 1; i < s1.length(); i++) {
//            String l1 = s1.substring(0, i);
//            String l2 = s2.substring(0, i);
//            String l3 = s2.substring(s1.length() - i);
//            String r1 = s1.substring(i);
//            String r2 = s2.substring(i);
//            String r3 = s2.substring(0, s1.length() - i);
//            if ((isScramble(l1, l2) && isScramble(r1, r2)) || (isScramble(l1, l3) && isScramble(r1, r3))) {
//                map.computeIfAbsent(s1, s -> new HashMap<>()).put(s2, true);
//                return true;
//            }
//        }
//        map.computeIfAbsent(s1, s -> new HashMap<>()).put(s2, false);
//        return false;
//    }
//
//    private boolean equals(String s1, String s2) {
//        int res = 0;
//        for (char ch : s1.toCharArray()) {
//            res ^= ch;
//        }
//        for (char ch : s2.toCharArray()) {
//            res ^= ch;
//        }
//        return res == 0;
//    }

//    private String obj;
//    private boolean isScramble;
//    private Map<String, Set<String>> map;
//
//    public boolean isScramble(String s1, String s2) {
//        if (s1.equals(s2)) return true;
//        this.obj = s2;
//        this.isScramble = false;
//        this.map = new HashMap<>();
//        isScramble(s1);
//        return isScramble;
//    }
//
//    private Set<String> isScramble(String s) {
//        if (isScramble) return new HashSet<>();
//        if (map.containsKey(s)) return map.get(s);
//        if (s.length() == 1) return Collections.singleton(s);
//        Set<String> set = new HashSet<>();
//        for (int i = 1; i < s.length() && !isScramble; i++) {
//            String l = s.substring(0, i);
//            String r = s.substring(i);
//            Set<String> set1 = isScramble(l);
//            map.put(l, set1);
//            Set<String> set2 = isScramble(r);
//            map.put(r, set2);
//            for (String s1 : set1) {
//                for (String s2 : set2) {
//                    set.add(s1 + s2);
//                    set.add(s2 + s1);
//                    if (set.contains(obj)) {
//                        isScramble = true;
//                        break;
//                    }
//                }
//                if (isScramble) break;
//            }
//        }
//        return set;
//    }

}
