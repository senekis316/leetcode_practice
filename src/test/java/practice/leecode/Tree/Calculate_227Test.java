package practice.leecode.Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class Calculate_227Test {

    @Test
    public void calculate_1() {
        Calculate_227 calculate_227 = new Calculate_227();
        assertEquals(7, calculate_227.calculate("3+2*2"));
    }

    @Test
    public void calculate_2() {
        Calculate_227 calculate_227 = new Calculate_227();
        assertEquals(1, calculate_227.calculate(" 3/2 "));
    }

    @Test
    public void calculate_3() {
        Calculate_227 calculate_227 = new Calculate_227();
        assertEquals(5, calculate_227.calculate(" 3+5 / 2 "));
    }

}