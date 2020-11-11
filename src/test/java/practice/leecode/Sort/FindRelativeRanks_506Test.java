package practice.leecode.Sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindRelativeRanks_506Test {

    @Test
    public void findRelativeRanks() {
        String[] expect = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        FindRelativeRanks_506 findRelativeRanks_506 = new FindRelativeRanks_506();
        assertArrayEquals(expect, findRelativeRanks_506.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
    }
}