package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecompressRLElist_1313Test {

    @Test
    public void decompressRLElist() {
        DecompressRLElist_1313 DecompressRLElist_1313 = new DecompressRLElist_1313();
        assertArrayEquals(new int[]{2,4,4,4},DecompressRLElist_1313.decompressRLElist(new int[]{1,2,3,4}));
    }
}