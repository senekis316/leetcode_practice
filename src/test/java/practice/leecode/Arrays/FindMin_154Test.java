package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMin_154Test {

    @Test
    public void findMin_1() {
        FindMin_154 findMin_154 = new FindMin_154();
        assertEquals(1, findMin_154.findMin(new int[]{1,3,5}));
    }

    @Test
    public void findMin_2() {
        FindMin_154 findMin_154 = new FindMin_154();
        assertEquals(0, findMin_154.findMin(new int[]{2,2,2,0,1}));
    }

}