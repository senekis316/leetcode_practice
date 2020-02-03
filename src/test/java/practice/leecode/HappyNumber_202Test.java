package practice.leecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumber_202Test {

    @Test
    public void isHappy() {
        HappyNumber_202 happyNumber = new HappyNumber_202();
        assertTrue(happyNumber.isHappy(19));
    }
}