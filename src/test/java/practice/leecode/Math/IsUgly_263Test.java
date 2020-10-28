package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsUgly_263Test {

    @Test
    public void isUgly_1() {
        IsUgly_263 isUgly_263 = new IsUgly_263();
        assertTrue(isUgly_263.isUgly(6));
    }

    @Test
    public void isUgly_2() {
        IsUgly_263 isUgly_263 = new IsUgly_263();
        assertTrue(isUgly_263.isUgly(8));
    }

    @Test
    public void isUgly_3() {
        IsUgly_263 isUgly_263 = new IsUgly_263();
        assertFalse(isUgly_263.isUgly(14));
    }

    @Test
    public void isUgly_4() {
        IsUgly_263 isUgly_263 = new IsUgly_263();
        assertTrue(isUgly_263.isUgly(0));
    }

}