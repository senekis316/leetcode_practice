package practice.leecode.LinkedTable;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagrams_49Test {

    @Test
    public void groupAnagrams_1() {
        List<List<String>> expect = new ArrayList<>();
        expect.add(List.of("ate", "eat", "tea"));
        expect.add(List.of("nat","tan"));
        expect.add(List.of("bat"));

        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams_49 groupAnagrams_49 = new GroupAnagrams_49();

        List<List<String>> actual = groupAnagrams_49.groupAnagrams(strs);
        CollectionUtils.isEqualCollection(actual, expect);
    }

    @Test
    public void groupAnagrams_2() {
        List<List<String>> expect = new ArrayList<>();
        expect.add(List.of(""));
        expect.add(List.of("b"));

        String[] strs = new String[]{"", "b"};
        GroupAnagrams_49 groupAnagrams_49 = new GroupAnagrams_49();

        List<List<String>> actual = groupAnagrams_49.groupAnagrams(strs);
        CollectionUtils.isEqualCollection(actual, expect);
    }

    @Test
    public void groupAnagrams_3() {
        List<List<String>> expect = new ArrayList<>();
        expect.add(List.of("", ""));

        String[] strs = new String[]{"", ""};
        GroupAnagrams_49 groupAnagrams_49 = new GroupAnagrams_49();

        List<List<String>> actual = groupAnagrams_49.groupAnagrams(strs);
        CollectionUtils.isEqualCollection(actual, expect);
    }
}