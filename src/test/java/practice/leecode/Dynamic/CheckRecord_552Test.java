package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckRecord_552Test {

    @Test
    public void checkRecord_1() {
        CheckRecord_552 checkRecord_552 = new CheckRecord_552();
        assertEquals(8, checkRecord_552.checkRecord(2));
    }

    @Test
    public void checkRecord_2() {
        CheckRecord_552 checkRecord_552 = new CheckRecord_552();
        assertEquals(3, checkRecord_552.checkRecord(1));
    }

    @Test
    public void checkRecord_3() {
        CheckRecord_552 checkRecord_552 = new CheckRecord_552();
        assertEquals(183236316, checkRecord_552.checkRecord(10101));
    }

}