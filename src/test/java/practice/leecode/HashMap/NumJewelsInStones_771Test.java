package practice.leecode.HashMap;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumJewelsInStones_771Test {

    @Test
    public void numJewelsInStones() {
        NumJewelsInStones_771 NumJewelsInStones_771 = new NumJewelsInStones_771();
        assertEquals(3, NumJewelsInStones_771.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, NumJewelsInStones_771.numJewelsInStones("z", "ZZ"));
    }
}