package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindNumbers_1295Test {

    @Test
    public void findNumbers() {
        FindNumbers_1295 findNumbers_1295 = new FindNumbers_1295();
        assertEquals(2, findNumbers_1295.findNumbers(new int[]{12,345,2,6,7896}));
    }

    /*@Test
    public void findNumbers() {
        FindNumbers_1295 findNumbers_1295 = new FindNumbers_1295();
        assertEquals(4, findNumbers_1295.findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }*/
}