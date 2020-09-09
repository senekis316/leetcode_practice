package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueChar_387Test {

    @Test
    public void firstUniqueChar() {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        FirstUniqueChar_387 firstUniqueChar_387 = new FirstUniqueChar_387();
        assertEquals(0, firstUniqueChar_387.firstUniqueChar(s1));
        assertEquals(2, firstUniqueChar_387.firstUniqueChar(s2));
    }

}