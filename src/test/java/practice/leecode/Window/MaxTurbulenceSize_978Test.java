package practice.leecode.Window;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTurbulenceSize_978Test {

    @Test
    public void maxTurbulenceSize_1() {
        MaxTurbulenceSize_978 maxTurbulenceSize_978 = new MaxTurbulenceSize_978();
        assertEquals(5, maxTurbulenceSize_978.maxTurbulenceSize(new int[]{9,4,2,10,7,8,8,1,9}));
    }

    @Test
    public void maxTurbulenceSize_2() {
        MaxTurbulenceSize_978 maxTurbulenceSize_978 = new MaxTurbulenceSize_978();
        assertEquals(2, maxTurbulenceSize_978.maxTurbulenceSize(new int[]{4,8,12,16}));
    }

    @Test
    public void maxTurbulenceSize_3() {
        MaxTurbulenceSize_978 maxTurbulenceSize_978 = new MaxTurbulenceSize_978();
        assertEquals(1, maxTurbulenceSize_978.maxTurbulenceSize(new int[]{100}));
    }

    @Test
    public void maxTurbulenceSize_4() {
        MaxTurbulenceSize_978 maxTurbulenceSize_978 = new MaxTurbulenceSize_978();
        assertEquals(5, maxTurbulenceSize_978.maxTurbulenceSize(new int[]{0,1,1,0,1,0,1,1,0,0}));
    }

    @Test
    public void maxTurbulenceSize_5() {
        MaxTurbulenceSize_978 maxTurbulenceSize_978 = new MaxTurbulenceSize_978();
        assertEquals(8, maxTurbulenceSize_978.maxTurbulenceSize(new int[]{0,8,45,88,48,68,28,55,17,24}));
    }

}