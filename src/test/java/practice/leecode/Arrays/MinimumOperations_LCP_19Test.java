package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumOperations_LCP_19Test {

    @Test
    public void minimumOperations_1() {
        MinimumOperations_LCP_19 minimumOperations_LCP_19 = new MinimumOperations_LCP_19();
        assertEquals(2, minimumOperations_LCP_19.minimumOperations("rrryyyrryyyrr"));
    }

    @Test
    public void minimumOperations_2() {
        MinimumOperations_LCP_19 minimumOperations_LCP_19 = new MinimumOperations_LCP_19();
        assertEquals(0, minimumOperations_LCP_19.minimumOperations("ryr"));
    }

    @Test
    public void minimumOperations_3() {
        MinimumOperations_LCP_19 minimumOperations_LCP_19 = new MinimumOperations_LCP_19();
        assertEquals(3, minimumOperations_LCP_19.minimumOperations("yry"));
    }

    @Test
    public void minimumOperations_4() {
        MinimumOperations_LCP_19 minimumOperations_LCP_19 = new MinimumOperations_LCP_19();
        assertEquals(41, minimumOperations_LCP_19.minimumOperations(
    "ryyryyyrryyyyyryyyrrryyyryryyyyryyrrryryyyryrryrrrryyyrrrrryryyrrrrryyyryyryrryryyryyyyryyrryrryryy"));
    }

}