package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class HammingWeight_191Test {

    @Test
    public void hammingWeight() {
        HammingWeight_191 hammingWeight_191 = new HammingWeight_191();
        assertEquals(3, hammingWeight_191.hammingWeight(0b00000000000000000000000000001011));
        assertEquals(1, hammingWeight_191.hammingWeight(0b00000000000000000000000010000000));
        assertEquals(31, hammingWeight_191.hammingWeight(0b11111111111111111111111111111101));
    }
}