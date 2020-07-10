package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxScoreSightseeingPair_1014Test {

    @Test
    public void maxScoreSightseeingPair_1() {
        MaxScoreSightseeingPair_1014 maxScoreSightseeingPair_1014 = new MaxScoreSightseeingPair_1014();
        assertEquals(11, maxScoreSightseeingPair_1014.maxScoreSightseeingPair(new int[]{8,1,5,2,6}));
    }

    @Test
    public void maxScoreSightseeingPair_2() {
        MaxScoreSightseeingPair_1014 maxScoreSightseeingPair_1014 = new MaxScoreSightseeingPair_1014();
        assertEquals(7, maxScoreSightseeingPair_1014.maxScoreSightseeingPair(new int[]{1,3,5}));
    }

    @Test
    public void maxScoreSightseeingPair_3() {
        MaxScoreSightseeingPair_1014 maxScoreSightseeingPair_1014 = new MaxScoreSightseeingPair_1014();
        assertEquals(3, maxScoreSightseeingPair_1014.maxScoreSightseeingPair(new int[]{2,2,1}));
    }


}