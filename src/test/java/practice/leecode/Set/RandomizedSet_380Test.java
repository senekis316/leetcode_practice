package practice.leecode.Set;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomizedSet_380Test {

    @Test
    public void RandomizedSet_380Test_1() {
        RandomizedSet_380 randomSet = new RandomizedSet_380();
        assertTrue(randomSet.insert(1));
        assertFalse(randomSet.remove(2));
        assertTrue(randomSet.insert(2));
        int value = randomSet.getRandom();
        assertTrue( value == 1 || value == 2);
        assertTrue(randomSet.remove(1));
        assertFalse(randomSet.insert(2));
        assertEquals(2, randomSet.getRandom());
    }

    @Test
    public void RandomizedSet_380Test_2() {
        RandomizedSet_380 randomSet = new RandomizedSet_380();
        assertFalse(randomSet.remove(0));
        assertFalse(randomSet.remove(0));
        assertTrue(randomSet.insert(0));
        assertTrue( randomSet.getRandom() == 0);
        assertTrue(randomSet.remove(0));
        assertTrue(randomSet.insert(0));
    }

    @Test
    public void RandomizedSet_380Test_3() {
        RandomizedSet_380 randomSet = new RandomizedSet_380();
        assertTrue(randomSet.insert(0));
        assertTrue(randomSet.insert(1));
        assertTrue(randomSet.remove(0));
        assertTrue(randomSet.insert(2));
        assertTrue(randomSet.remove(1));
        assertTrue(randomSet.getRandom() == 2);
    }

}