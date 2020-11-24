package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertToBase7_504Test {

    @Test
    public void convertToBase7_1() {
        ConvertToBase7_504 convertToBase7_504 = new ConvertToBase7_504();
        assertEquals("202", convertToBase7_504.convertToBase7(100));
    }

    @Test
    public void convertToBase7_2() {
        ConvertToBase7_504 convertToBase7_504 = new ConvertToBase7_504();
        assertEquals("-10", convertToBase7_504.convertToBase7(-7));
    }


}