package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Convert_6Test {

    @Test
    public void convert_1() {
        Convert_6 convert_6 = new Convert_6();
        assertEquals("PAHNAPLSIIGYIR", convert_6.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void convert_2() {
        Convert_6 convert_6 = new Convert_6();
        assertEquals("PINALSIGYAHRPI", convert_6.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void convert_3() {
        Convert_6 convert_6 = new Convert_6();
        assertEquals("A", convert_6.convert("A", 1));
    }
}