package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxAverage_643Test {

    @Test
    public void findMaxAverage_1() {
        FindMaxAverage_643 findMaxAverage_643 = new FindMaxAverage_643();
        assertEquals(12.75, findMaxAverage_643.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4), 2);
    }

    @Test
    public void findMaxAverage_2() {
        FindMaxAverage_643 findMaxAverage_643 = new FindMaxAverage_643();
        assertEquals(5.0, findMaxAverage_643.findMaxAverage(new int[]{5}, 1), 1);
    }

    @Test
    public void findMaxAverage_3() {
        FindMaxAverage_643 findMaxAverage_643 = new FindMaxAverage_643();
        assertEquals(2.8, findMaxAverage_643.findMaxAverage(new int[]{4,0,4,3,3}, 5), 1);
    }

    @Test
    public void findMaxAverage_4() {
        FindMaxAverage_643 findMaxAverage_643 = new FindMaxAverage_643();
        assertEquals(2.0, findMaxAverage_643.findMaxAverage(new int[]{0,1,1,3,3}, 4), 1);
    }


}