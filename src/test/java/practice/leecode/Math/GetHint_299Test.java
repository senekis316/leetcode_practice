package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetHint_299Test {

    @Test
    public void getHint_1() {
        GetHint_299 getHint_299 = new GetHint_299();
        String result = getHint_299.getHint("1807", "7810");
        String expect = "1A3B";
        assertEquals(expect, result);
    }

    @Test
    public void getHint_2() {
        GetHint_299 getHint_299 = new GetHint_299();
        String result = getHint_299.getHint("1123", "0111");
        String expect = "1A1B";
        assertEquals(expect, result);
    }

    @Test
    public void getHint_3() {
        GetHint_299 getHint_299 = new GetHint_299();
        String result = getHint_299.getHint("1122", "2211");
        String expect = "0A4B";
        assertEquals(expect, result);
    }

}