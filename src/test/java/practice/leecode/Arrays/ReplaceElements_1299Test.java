package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceElements_1299Test {

    @Test
    public void replaceElements() {
        ReplaceElements_1299 ReplaceElements_1299 = new ReplaceElements_1299();
        assertArrayEquals(new int[]{18,6,6,6,1,-1} , ReplaceElements_1299.replaceElements(new int[]{17,18,5,4,6,1}));
    }
}