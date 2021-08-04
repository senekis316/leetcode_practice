package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleNumber_611Test {

    @Test
    public void triangleNumber_1() {
        TriangleNumber_611 triangleNumber_611 = new TriangleNumber_611();
        assertEquals(0, triangleNumber_611.triangleNumber(new int[]{1,1,3,4}));
    }

    @Test
    public void triangleNumber_2() {
        TriangleNumber_611 triangleNumber_611 = new TriangleNumber_611();
        assertEquals(3, triangleNumber_611.triangleNumber(new int[]{2,2,3,4}));
    }

    @Test
    public void triangleNumber_3() {
        TriangleNumber_611 triangleNumber_611 = new TriangleNumber_611();
        assertEquals(0, triangleNumber_611.triangleNumber(new int[]{7,0,0,0}));
    }

}