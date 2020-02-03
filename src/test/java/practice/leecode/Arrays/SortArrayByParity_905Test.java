package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortArrayByParity_905Test {

    @Test
    public void sortArrayByParity() {
        SortArrayByParity_905 sortArrayByParity_905 = new SortArrayByParity_905();
        assertArrayEquals(new int[]{4,2,1,3}, sortArrayByParity_905.sortArrayByParity(new int[]{3,1,2,4}));
    }
}