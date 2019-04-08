package practice.leecode.qq.SortAndSearch;

import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class ArrayRotateTest {

    @Test
    public void search() {

        ArrayRotate arrayRotate = new ArrayRotate();
        assertEquals(4, arrayRotate.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, arrayRotate.search(new int[]{4,5,6,7,0,1,2}, 3));

    }
}