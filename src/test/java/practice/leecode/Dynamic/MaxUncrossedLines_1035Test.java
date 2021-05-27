package practice.leecode.Dynamic;

import org.junit.Test;


import static org.junit.Assert.*;

public class MaxUncrossedLines_1035Test {

    @Test
    public void maxUncrossedLines_1() {
        MaxUncrossedLines_1035 maxUncrossedLines_1035 = new MaxUncrossedLines_1035();
        assertEquals(2, maxUncrossedLines_1035.maxUncrossedLines(new int[]{1,4,2}, new int[]{1,2,4}));
    }

    @Test
    public void maxUncrossedLines_2() {
        MaxUncrossedLines_1035 maxUncrossedLines_1035 = new MaxUncrossedLines_1035();
        assertEquals(3, maxUncrossedLines_1035.maxUncrossedLines(new int[]{2,5,1,2,5}, new int[]{10,5,2,1,5,2}));
    }

    @Test
    public void maxUncrossedLines_3() {
        MaxUncrossedLines_1035 maxUncrossedLines_1035 = new MaxUncrossedLines_1035();
        assertEquals(2, maxUncrossedLines_1035.maxUncrossedLines(new int[]{1,3,7,1,7,5}, new int[]{1,9,2,5,1}));
    }

}