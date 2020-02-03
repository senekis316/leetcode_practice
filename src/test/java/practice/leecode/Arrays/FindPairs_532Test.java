package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPairs_532Test {

    @Test
    public void findPairs_1() {
        FindPairs_532 findPairs_532 = new FindPairs_532();
        assertEquals(2, findPairs_532.findPairs(new int[]{3,1,4,1,5}, 2));
    }

    @Test
    public void findPairs_2() {
        FindPairs_532 findPairs_532 = new FindPairs_532();
        assertEquals(4, findPairs_532.findPairs(new int[]{1,2,3,4,5}, 1));
    }

    @Test
    public void findPairs_3() {
        FindPairs_532 findPairs_532 = new FindPairs_532();
        assertEquals(1, findPairs_532.findPairs(new int[]{1,3,1,5,4}, 0));
    }

    @Test
    public void findPairs_4() {
        FindPairs_532 findPairs_532 = new FindPairs_532();
        assertEquals(2, findPairs_532.findPairs(new int[]{6,7,3,6,4,6,3,5,6,9}, 4));
    }

    @Test
    public void findPairs_5() {
        FindPairs_532 findPairs_532 = new FindPairs_532();
        assertEquals(1, findPairs_532.findPairs(new int[]{1,1,1,2,1}, 1));
    }

}