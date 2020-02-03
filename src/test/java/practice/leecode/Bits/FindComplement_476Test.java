package practice.leecode.Bits;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindComplement_476Test {

    FindComplement_476 FindComplement_476 = new FindComplement_476();

    @Test
    public void findComplement_1() {
        assertEquals(2, FindComplement_476.findComplement(5));
    }

    @Test
    public void findComplement_2() {
        assertEquals(0, FindComplement_476.findComplement(1));
    }

}