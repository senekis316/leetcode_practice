package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Compress_443Test {

    @Test
    public void compress_1() {
        Compress_443 compress_443 = new Compress_443();
        assertEquals(6, compress_443.compress(new char[]{'a','a','b','b','c','c','c'}));
    }

    @Test
    public void compress_2() {
        Compress_443 compress_443 = new Compress_443();
        assertEquals(1, compress_443.compress(new char[]{'a'}));
    }

    @Test
    public void compress_3() {
        Compress_443 compress_443 = new Compress_443();
        assertEquals(4, compress_443.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }

    @Test
    public void compress_4() {
        Compress_443 compress_443 = new Compress_443();
        assertEquals(6, compress_443.compress(new char[]{'a','a','b','b','c','c','c'}));
    }

}