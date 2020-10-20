package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertToTitle_168Test {

    @Test
    public void convertToTitle_1() {
        ConvertToTitle_168 convertToTitle_168 = new ConvertToTitle_168();
        String result = convertToTitle_168.convertToTitle(1);
        String expect = "A";
        assertEquals(expect, result);
    }

    @Test
    public void convertToTitle_2() {
        ConvertToTitle_168 convertToTitle_168 = new ConvertToTitle_168();
        String result = convertToTitle_168.convertToTitle(28);
        String expect = "AB";
        assertEquals(expect, result);
    }

    @Test
    public void convertToTitle_3() {
        ConvertToTitle_168 convertToTitle_168 = new ConvertToTitle_168();
        String result = convertToTitle_168.convertToTitle(701);
        String expect = "ZY";
        assertEquals(expect, result);
    }

}