package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindRadius_475Test {

    @Test
    public void findRadius_1() {
        int[] houses = new int[]{1,2,3};
        int[] heaters = new int[]{2};
        FindRadius_475 findRadius_475 = new FindRadius_475();
        assertEquals(1, findRadius_475.findRadius(houses, heaters));
    }

    @Test
    public void findRadius_2() {
        int[] houses = new int[]{1,2,3,4};
        int[] heaters = new int[]{1,4};
        FindRadius_475 findRadius_475 = new FindRadius_475();
        assertEquals(1, findRadius_475.findRadius(houses, heaters));
    }

    @Test
    public void findRadius_3() {
        int[] houses = new int[]{1,5};
        int[] heaters = new int[]{2};
        FindRadius_475 findRadius_475 = new FindRadius_475();
        assertEquals(3, findRadius_475.findRadius(houses, heaters));
    }

}