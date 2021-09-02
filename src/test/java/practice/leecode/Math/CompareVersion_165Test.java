package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareVersion_165Test {

    @Test
    public void compareVersion_1() {
        CompareVersion_165 compareVersion_165 = new CompareVersion_165();
        assertEquals(0, compareVersion_165.compareVersion("1.01", "1.001"));
    }

    @Test
    public void compareVersion_2() {
        CompareVersion_165 compareVersion_165 = new CompareVersion_165();
        assertEquals(0, compareVersion_165.compareVersion("1.0", "1.0.0"));
    }

    @Test
    public void compareVersion_3() {
        CompareVersion_165 compareVersion_165 = new CompareVersion_165();
        assertEquals(-1, compareVersion_165.compareVersion("0.1", "1.1"));
    }

    @Test
    public void compareVersion_4() {
        CompareVersion_165 compareVersion_165 = new CompareVersion_165();
        assertEquals(1, compareVersion_165.compareVersion("1.0.1", "1"));
    }

    @Test
    public void compareVersion_5() {
        CompareVersion_165 compareVersion_165 = new CompareVersion_165();
        assertEquals(-1, compareVersion_165.compareVersion("7.5.2.4", "7.5.3"));
    }

}