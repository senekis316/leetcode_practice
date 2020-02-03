package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanPlaceFlowers_605Test {

    @Test
    public void canPlaceFlowers_1() {
        CanPlaceFlowers_605 canPlaceFlowers_605 = new CanPlaceFlowers_605();
        assertEquals(true, canPlaceFlowers_605.canPlaceFlowers(new int[]{ 1,0,0,0,1}, 1));
    }

    @Test
    public void canPlaceFlowers_2() {
        CanPlaceFlowers_605 canPlaceFlowers_605 = new CanPlaceFlowers_605();
        assertEquals(false, canPlaceFlowers_605.canPlaceFlowers(new int[]{ 1,0,0,0,1}, 2));
    }

}