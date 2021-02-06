package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxScore_1423Test {

    @Test
    public void maxScore_1() {
        MaxScore_1423 maxScore_1423 = new MaxScore_1423();
        assertEquals(12, maxScore_1423.maxScore(new int[]{1,2,3,4,5,6,1}, 3));
    }

    @Test
    public void maxScore_2() {
        MaxScore_1423 maxScore_1423 = new MaxScore_1423();
        assertEquals(4, maxScore_1423.maxScore(new int[]{2,2,2}, 2));
    }

    @Test
    public void maxScore_3() {
        MaxScore_1423 maxScore_1423 = new MaxScore_1423();
        assertEquals(55, maxScore_1423.maxScore(new int[]{9,7,7,9,7,7,9}, 7));
    }

    @Test
    public void maxScore_4() {
        MaxScore_1423 maxScore_1423 = new MaxScore_1423();
        assertEquals(1, maxScore_1423.maxScore(new int[]{1,1000,1}, 1));
    }

    @Test
    public void maxScore_5() {
        MaxScore_1423 maxScore_1423 = new MaxScore_1423();
        assertEquals(202, maxScore_1423.maxScore(new int[]{1,79,80,1,1,1,200,1}, 3));
    }

}