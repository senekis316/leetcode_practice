package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlatesBetweenCandles_2055Test {

    @Test
    public void platesBetweenCandles_1() {
        PlatesBetweenCandles_2055 platesBetweenCandles_2055 = new PlatesBetweenCandles_2055();
        assertArrayEquals(new int[]{2,3}, platesBetweenCandles_2055.platesBetweenCandles("**|**|***|", new int[][]{{2,5},{5,9}}));
    }

    @Test
    public void platesBetweenCandles_2() {
        PlatesBetweenCandles_2055 platesBetweenCandles_2055 = new PlatesBetweenCandles_2055();
        assertArrayEquals(new int[]{9,0,0,0,0}, platesBetweenCandles_2055.platesBetweenCandles("***|**|*****|**||**|*", new int[][]{{1,17},{4,5},{14,17},{5,11},{15,16}}));
    }

    @Test
    public void platesBetweenCandles_3() {
        PlatesBetweenCandles_2055 platesBetweenCandles_2055 = new PlatesBetweenCandles_2055();
        assertArrayEquals(new int[]{9,9,9,10,6,4,0,9,9,9,10,7,9,8,8,7,9,10,9,8,5,9,2,7,8,7,9,8}, platesBetweenCandles_2055.platesBetweenCandles("*|*||||**|||||||*||*||*||**|*|*||*", new int[][]{{2,33},{2,32},{3,31},{0,33},{1,24},{3,20},{7,11},{5,32},{2,31},{5,31},{0,31},{3,28},{4,33},{6,29},{2,30},{2,28},{1,30},{1,33},{4,32},{5,30},{4,23},{0,30},{3,10},{5,28},{0,28},{4,28},{3,33},{0,27}}));
    }

    @Test
    public void platesBetweenCandles_4() {
        PlatesBetweenCandles_2055 platesBetweenCandles_2055 = new PlatesBetweenCandles_2055();
        assertArrayEquals(new int[]{0}, platesBetweenCandles_2055.platesBetweenCandles("||*", new int[][]{{2,2}}));
    }

}