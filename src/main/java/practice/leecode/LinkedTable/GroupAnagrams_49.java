package practice.leecode.LinkedTable;

import java.util.*;

public class GroupAnagrams_49 {

    static double[] reMap = new double[]{
        2,3,5,7,11,13,17,19,23,29,
        31,37,41,43,47,53,59,61,67,71,
        73,79,83,89,97,101
    };

    static double hash (String str) {
        double hash = 1;
        for (int ch : str.toCharArray()) {
            hash *= reMap[ch - 'a'];
        }
        return hash;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> stringListMap = new HashMap<>();
        for (String str : strs) {
            double key = hash(str);
            if (!stringListMap.containsKey(key)) {
                stringListMap.put(key, new ArrayList<>());
            }
            stringListMap.get(key).add(str);
        }
        return new ArrayList<>(stringListMap.values());
    }



//    private Map<String, List<String>> stringListMap;
//
//    public List<List<String>> groupAnagrams(String[] strs) {
//        stringListMap = new HashMap<>();
//        int[] counts = new int[26];
//        for (String str : strs) {
//            Arrays.fill(counts, 0);
//            for (char ch : str.toCharArray()) {
//                counts[ch - 'a']++;
//            }
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < counts.length; i++) {
//                sb.append(counts[i]);
//                sb.append("#");
//            }
//            String key = sb.toString();
//            if (!stringListMap.containsKey(key)) {
//                stringListMap.put(key, new ArrayList<>());
//            }
//            stringListMap.get(key).add(str);
//        }
//        return new ArrayList<>(stringListMap.values());
//    }

}
