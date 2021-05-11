package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Decode_1734Test {

    @Test
    public void decode_1() {
        int[] encoded = new int[]{3,1};
        int[] result = new int[]{1,2,3};
        assertArrayEquals(result, new Decode_1734().decode(encoded));
    }

    @Test
    public void decode_2() {
        int[] encoded = new int[]{6,5,4,6};
        int[] result = new int[]{2,4,1,5,3};
        assertArrayEquals(result, new Decode_1734().decode(encoded));
    }

}