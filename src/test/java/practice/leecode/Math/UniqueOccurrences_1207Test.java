package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueOccurrences_1207Test {

    @Test
    public void uniqueOccurrences_1() {
        UniqueOccurrences_1207 uniqueOccurrences_1207 = new UniqueOccurrences_1207();
        assertTrue(uniqueOccurrences_1207.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    @Test
    public void uniqueOccurrences_2() {
        UniqueOccurrences_1207 uniqueOccurrences_1207 = new UniqueOccurrences_1207();
        assertFalse(uniqueOccurrences_1207.uniqueOccurrences(new int[]{1,2}));
    }

    @Test
    public void uniqueOccurrences_3() {
        UniqueOccurrences_1207 uniqueOccurrences_1207 = new UniqueOccurrences_1207();
        assertTrue(uniqueOccurrences_1207.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }

}