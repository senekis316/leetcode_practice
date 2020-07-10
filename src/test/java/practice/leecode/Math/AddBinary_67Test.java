package practice.leecode.Math;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddBinary_67Test {

    @Test
    public void addBinary_1() {
        AddBinary_67 addBinary_67 = new AddBinary_67();
        assertEquals("100", addBinary_67.addBinary("11", "1"));
    }

    @Test
    public void addBinary_2() {
        AddBinary_67 addBinary_67 = new AddBinary_67();
        assertEquals("10101", addBinary_67.addBinary("1010", "1011"));
    }

    @Test
    public void addBinary_3() {
        AddBinary_67 addBinary_67 = new AddBinary_67();
        assertEquals("11110", addBinary_67.addBinary("1111", "1111"));
    }

    @Test
    public void addBinary_4() {
        AddBinary_67 addBinary_67 = new AddBinary_67();
        assertEquals("110110", addBinary_67.addBinary("100", "110010"));
    }

}