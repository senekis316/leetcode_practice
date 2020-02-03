package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToHex_405Test {

    @Test
    public void toHex() {
        ToHex_405 toHex_405 = new ToHex_405();
        assertEquals("1a", toHex_405.toHex(26));
        assertEquals("ffffffff", toHex_405.toHex(-1));
    }
}