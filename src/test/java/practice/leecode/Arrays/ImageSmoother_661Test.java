package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImageSmoother_661Test {

    @Test
    public void imageSmoother_1() {
        ImageSmoother_661 imageSmoother_661 = new ImageSmoother_661();
        assertArrayEquals(new int[][]{{0,0,0},{0,0,0},{0,0,0}}, imageSmoother_661.imageSmoother(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));
    }

    @Test
    public void imageSmoother_2() {
        ImageSmoother_661 imageSmoother_661 = new ImageSmoother_661();
        assertArrayEquals(new int[][]{{4,4,5},{5,6,6},{8,9,9},{11,12,12},{13,13,14}}, imageSmoother_661.imageSmoother(new int[][]{{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}}));
    }

    @Test
    public void imageSmoother_3() {
        ImageSmoother_661 imageSmoother_661 = new ImageSmoother_661();
        assertArrayEquals(new int[][]{{1}}, imageSmoother_661.imageSmoother(new int[][]{{1}}));
    }

}