package practice.leecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanConstruct_383Test {

    @Test
    public void canConstruct() {

        CanConstruct_383 canConstruct_383 = new CanConstruct_383();
        assertEquals(true, canConstruct_383.canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
        assertEquals(false, canConstruct_383.canConstruct("a", "b"));
        assertEquals(false, canConstruct_383.canConstruct("aa", "ab"));
        assertEquals(true, canConstruct_383.canConstruct("aa", "aab"));

    }
}