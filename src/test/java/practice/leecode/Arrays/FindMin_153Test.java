package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMin_153Test {

    @Test
    public void findMin_1() {
        FindMin_153 findMin_153 = new FindMin_153();
        assertEquals(1, findMin_153.findMin(new int[]{3,4,5,1,2}));
    }

    @Test
    public void findMin_2() {
        FindMin_153 findMin_153 = new FindMin_153();
        assertEquals(0, findMin_153.findMin(new int[]{4,5,6,7,0,1,2}));
    }

    @Test
    public void findMin_3() {
        FindMin_153 findMin_153 = new FindMin_153();
        assertEquals(1, findMin_153.findMin(new int[]{1}));
    }

}