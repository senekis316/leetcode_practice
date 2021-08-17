package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckRecord_551Test {

    @Test
    public void checkRecord_1() {
        CheckRecord_551 checkRecord_551 = new CheckRecord_551();
        assertTrue(checkRecord_551.checkRecord("PPALLP"));
    }

    @Test
    public void checkRecord_2() {
        CheckRecord_551 checkRecord_551 = new CheckRecord_551();
        assertFalse(checkRecord_551.checkRecord("PPALLL"));
    }
}