package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class PancakeSort_969Test {

    @Test
    public void pancakeSort_1() {
        PancakeSort_969 pancakeSort_969 = new PancakeSort_969();
        assertArrayEquals(new int[]{2,3,1,2,1}, pancakeSort_969.pancakeSort(new int[]{3,2,4,1}).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void pancakeSort_2() {
        PancakeSort_969 pancakeSort_969 = new PancakeSort_969();
        assertArrayEquals(new int[]{}, pancakeSort_969.pancakeSort(new int[]{1,2,3}).stream().mapToInt(Integer::intValue).toArray());
    }

}