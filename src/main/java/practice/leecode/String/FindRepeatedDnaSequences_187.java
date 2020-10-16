package practice.leecode.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindRepeatedDnaSequences_187 {

    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) {
            return new ArrayList<>();
        }
        Set<String> dnaSet = new HashSet<>();
        Set<String> dnsCacheSet = new HashSet<>();
        int window = 10;
        for (int i = 0; i + window <= s.length(); i++) {
            String dna = s.substring(i, i + 10);
            if (dnsCacheSet.contains(dna)) {
                dnaSet.add(dna);
            } else {
                dnsCacheSet.add(dna);
            }
        }
        return dnaSet.stream().collect(Collectors.toList());
    }


//    public List<String> findRepeatedDnaSequences(String s) {
//        if (s.length() <= 10) {
//            return new ArrayList<>();
//        }
//        Set<String> dns = new HashSet<>();
//        Set<String> dnsCache = new HashSet<>();
//        StringBuilder sb = new StringBuilder(s.substring(0, 9));
//        for (int i = 9; i < s.length(); i++) {
//            if (i >= 10) {
//                sb.deleteCharAt(0);
//            }
//            sb.append(s.charAt(i));
//            if (dnsCache.contains(sb.toString())) {
//                dns.add(sb.toString());
//            } else {
//                dnsCache.add(sb.toString());
//            }
//        }
//        return dns.stream().collect(Collectors.toList());
//    }

//    方法一:
//    private char[] chars;
//    private Set<String> dns;
//
//    public List<String> findRepeatedDnaSequences(String s) {
//        dns = new HashSet<>();
//        chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = i + 1; j < chars.length; j++) {
//                if (equals(i, j)) {
//                    break;
//                }
//            }
//        }
//        return dns.stream().collect(Collectors.toList());
//    }
//
//    private boolean equals(int l, int r) {
//        if (r + 10 > chars.length) {
//            return false;
//        }
//        int sum = 0;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 10; i++) {
//            sum += chars[l + i] ^ chars[r + i];
//            sb.append(chars[l + i]);
//        }
//        if (sum == 0) {
//            dns.add(sb.toString());
//        }
//        return sum == 0;
//    }

}
