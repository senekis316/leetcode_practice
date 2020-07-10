package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumGap_164Test {

    @Test
    public void maximumGap_1() {
        MaximumGap_164 maximumGap_164 = new MaximumGap_164();
        assertEquals(3, maximumGap_164.maximumGap(new int[]{3,6,9,1}));
    }

    @Test
    public void maximumGap_2() {
        MaximumGap_164 maximumGap_164 = new MaximumGap_164();
        assertEquals(0, maximumGap_164.maximumGap(new int[]{10}));
    }

}