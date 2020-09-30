package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanCompleteCircuit_134Test {

    @Test
    public void canCompleteCircuit_1() {
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        CanCompleteCircuit_134 canCompleteCircuit_134 = new CanCompleteCircuit_134();
        assertEquals(3, canCompleteCircuit_134.canCompleteCircuit(gas, cost));
    }

    @Test
    public void canCompleteCircuit_2() {
        int[] gas = new int[]{2,3,4};
        int[] cost = new int[]{3,4,3};
        CanCompleteCircuit_134 canCompleteCircuit_134 = new CanCompleteCircuit_134();
        assertEquals(-1, canCompleteCircuit_134.canCompleteCircuit(gas, cost));
    }

    @Test
    public void canCompleteCircuit_3() {
        int[] gas = new int[]{5,1,2,3,4};
        int[] cost = new int[]{4,4,1,5,1};
        CanCompleteCircuit_134 canCompleteCircuit_134 = new CanCompleteCircuit_134();
        assertEquals(4, canCompleteCircuit_134.canCompleteCircuit(gas, cost));
    }

    @Test
    public void canCompleteCircuit_4() {
        int[] gas = new int[]{3,1,1};
        int[] cost = new int[]{1,2,2};
        CanCompleteCircuit_134 canCompleteCircuit_134 = new CanCompleteCircuit_134();
        assertEquals(0, canCompleteCircuit_134.canCompleteCircuit(gas, cost));
    }

}