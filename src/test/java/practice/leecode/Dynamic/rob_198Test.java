package practice.leecode.Dynamic;

import static org.junit.Assert.*;

import org.junit.Test;

public class rob_198Test {

    @Test
    public void rob_1() {
        Rob_198 Rob_198 = new Rob_198();
        assertEquals(4, Rob_198.rob(new int[]{1,2,3,1}));
    }

    @Test
    public void rob_2() {
        Rob_198 Rob_198 = new Rob_198();
        assertEquals(12, Rob_198.rob(new int[]{2,7,9,3,1}));
    }

    @Test
    public void rob_3() {
        Rob_198 Rob_198 = new Rob_198();
        assertEquals(13, Rob_198.rob(new int[]{3,2,9,3,1}));
    }

}