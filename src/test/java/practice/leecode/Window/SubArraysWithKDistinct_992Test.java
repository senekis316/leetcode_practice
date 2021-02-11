package practice.leecode.Window;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubArraysWithKDistinct_992Test {

    @Test
    public void subArraysWithKDistinct_1() {
        SubArraysWithKDistinct_992 subArraysWithKDistinct_992 = new SubArraysWithKDistinct_992();
        assertEquals(7, subArraysWithKDistinct_992.subArraysWithKDistinct(new int[]{1,2,1,2,3}, 2));
    }

    @Test
    public void subArraysWithKDistinct_2() {
        SubArraysWithKDistinct_992 subArraysWithKDistinct_992 = new SubArraysWithKDistinct_992();
        assertEquals(3, subArraysWithKDistinct_992.subArraysWithKDistinct(new int[]{1,2,1,3,4}, 3));
    }

    @Test
    public void subArraysWithKDistinct_3() {
        SubArraysWithKDistinct_992 subArraysWithKDistinct_992 = new SubArraysWithKDistinct_992();
        assertEquals(2, subArraysWithKDistinct_992.subArraysWithKDistinct(new int[]{1,2}, 1));
    }

}