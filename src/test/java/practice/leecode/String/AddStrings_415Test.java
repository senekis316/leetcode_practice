package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddStrings_415Test {

    @Test
    public void addStrings_1() {
        AddStrings_415 addStrings_415 = new AddStrings_415();
        assertEquals("134", addStrings_415.addStrings("11", "123"));
    }

    @Test
    public void addStrings_2() {
        AddStrings_415 addStrings_415 = new AddStrings_415();
        assertEquals("533", addStrings_415.addStrings("456", "77"));
    }

    @Test
    public void addStrings_3() {
        AddStrings_415 addStrings_415 = new AddStrings_415();
        assertEquals("0", addStrings_415.addStrings("0", "0"));
    }

    @Test
    public void addStrings_4() {
        AddStrings_415 addStrings_415 = new AddStrings_415();
        assertEquals("10", addStrings_415.addStrings("1", "9"));
    }

}