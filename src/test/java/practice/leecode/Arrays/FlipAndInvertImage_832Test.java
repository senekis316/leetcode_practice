package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlipAndInvertImage_832Test {

    @Test
    public void flipAndInvertImage() {
        FlipAndInvertImage_832 flipAndInvertImage_832 = new FlipAndInvertImage_832();
        assertArrayEquals(
            new int[][]{{1,0,0},{0,1,0},{1,1,1}},
            flipAndInvertImage_832.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}})
        );

    }
}