package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class KWeakestRows_1341Test {

    @Test
    public void kWeakestRows_1() {
        int[][] mat = {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int k = 3;
        KWeakestRows_1341 KWeakestRows_1341 = new KWeakestRows_1341();
        assertArrayEquals(new int[]{2,0,3}, KWeakestRows_1341.kWeakestRows(mat, k));
    }

    @Test
    public void kWeakestRows_2() {
        int[][] mat = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };
        int k = 2;
        KWeakestRows_1341 KWeakestRows_1341 = new KWeakestRows_1341();
        assertArrayEquals(new int[]{0,2}, KWeakestRows_1341.kWeakestRows(mat, k));
    }

}