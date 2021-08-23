package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetMaximumGenerated_1646Test {

    @Test
    public void getMaximumGenerated_1() {
        GetMaximumGenerated_1646 getMaximumGenerated_1646 = new GetMaximumGenerated_1646();
        assertEquals(3, getMaximumGenerated_1646.getMaximumGenerated(7));
    }

    @Test
    public void getMaximumGenerated_2() {
        GetMaximumGenerated_1646 getMaximumGenerated_1646 = new GetMaximumGenerated_1646();
        assertEquals(1, getMaximumGenerated_1646.getMaximumGenerated(2));
    }

    @Test
    public void getMaximumGenerated_3() {
        GetMaximumGenerated_1646 getMaximumGenerated_1646 = new GetMaximumGenerated_1646();
        assertEquals(2, getMaximumGenerated_1646.getMaximumGenerated(3));
    }

}