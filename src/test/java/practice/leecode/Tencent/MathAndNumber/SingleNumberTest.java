package practice.leecode.Tencent.MathAndNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void singleNumber() {
        SingleNumber singleNumber = new SingleNumber();
        assertEquals(1, singleNumber.singleNumber(new int[]{2,2,1}));
        assertEquals(4, singleNumber.singleNumber(new int[]{4,1,2,1,2}));

        //0000 ^ 1100 = 1100 = 4
        //1100 ^ 1001 = 0101 = 5
        //0101 ^ 1010 = 1111 = 7
        //1111 ^ 1001 = 0110 = 6
        //0110 ^ 1010 = 1100 = 4
    }
}