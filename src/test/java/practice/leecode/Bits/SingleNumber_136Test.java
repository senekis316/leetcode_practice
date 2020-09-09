package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumber_136Test {

    @Test
    public void singleNumber() {
        SingleNumber_136 singleNumber_136 = new SingleNumber_136();
        assertEquals(1, singleNumber_136.singleNumber(new int[]{2,2,1}));
        assertEquals(4, singleNumber_136.singleNumber(new int[]{4,1,2,1,2}));
    }

}