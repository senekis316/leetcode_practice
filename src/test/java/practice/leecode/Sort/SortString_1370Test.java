package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortString_1370Test {

    @Test
    public void sortString_1() {
        SortString_1370 sortString_1370 = new SortString_1370();
        assertEquals("abccbaabccba", sortString_1370.sortString("aaaabbbbcccc"));
    }

    @Test
    public void sortString_2() {
        SortString_1370 sortString_1370 = new SortString_1370();
        assertEquals("art", sortString_1370.sortString("rat"));
    }

    @Test
    public void sortString_3() {
        SortString_1370 sortString_1370 = new SortString_1370();
        assertEquals("cdelotee", sortString_1370.sortString("leetcode"));
    }

    @Test
    public void sortString_4() {
        SortString_1370 sortString_1370 = new SortString_1370();
        assertEquals("ggggggg", sortString_1370.sortString("ggggggg"));
    }

    @Test
    public void sortString_5() {
        SortString_1370 sortString_1370 = new SortString_1370();
        assertEquals("ops", sortString_1370.sortString("spo"));
    }

}