package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPoisonedDuration_495Test {

    @Test
    public void findPoisonedDuration_1() {
        FindPoisonedDuration_495 findPoisonedDuration_495 = new FindPoisonedDuration_495();
        assertEquals(4, findPoisonedDuration_495.findPoisonedDuration(new int[]{1,4}, 2));
    }

    @Test
    public void findPoisonedDuration_2() {
        FindPoisonedDuration_495 findPoisonedDuration_495 = new FindPoisonedDuration_495();
        assertEquals(3, findPoisonedDuration_495.findPoisonedDuration(new int[]{1,2}, 2));
    }

}