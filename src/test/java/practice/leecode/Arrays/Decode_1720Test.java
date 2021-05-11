package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Decode_1720Test {

    @Test
    public void decode_1() {
        int[] encoded = new int[]{1,2,3};
        int[] result = new int[]{1,0,2,1};
        assertArrayEquals(result, new Decode_1720().decode(encoded, 1));
    }

    @Test
    public void decode_2() {
        int[] encoded = new int[]{6,2,7,3};
        int[] result = new int[]{4,2,0,7,4};
        assertArrayEquals(result, new Decode_1720().decode(encoded, 4));
    }

}