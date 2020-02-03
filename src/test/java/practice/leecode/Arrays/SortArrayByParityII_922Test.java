package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortArrayByParityII_922Test {

    @Test
    public void sortArrayByParityII() {
        SortArrayByParityII_922 SortArrayByParityII_922 = new SortArrayByParityII_922();
        int[] res = SortArrayByParityII_922.sortArrayByParityII(new int[]{4,2,5,7});
        assertArrayEquals(new int[]{4,5,2,7}, res);
    }
}