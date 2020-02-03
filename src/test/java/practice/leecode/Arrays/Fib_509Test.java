package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fib_509Test {

    @Test
    public void fib_1() {
        Fib_509 Fib_509 = new Fib_509();
        assertEquals(1, Fib_509.fib(2));
    }

    @Test
    public void fib_2() {
        Fib_509 Fib_509 = new Fib_509();
        assertEquals(2, Fib_509.fib(3));
    }

    @Test
    public void fib_3() {
        Fib_509 Fib_509 = new Fib_509();
        assertEquals(3, Fib_509.fib(4));
    }
}