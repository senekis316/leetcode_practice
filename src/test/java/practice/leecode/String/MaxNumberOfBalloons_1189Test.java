package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxNumberOfBalloons_1189Test {

    @Test
    public void maxNumberOfBalloons_1() {
        MaxNumberOfBalloons_1189 maxNumberOfBalloons_1189 = new MaxNumberOfBalloons_1189();
        assertEquals(1, maxNumberOfBalloons_1189.maxNumberOfBalloons("nlaebolko"));
    }

    @Test
    public void maxNumberOfBalloons_2() {
        MaxNumberOfBalloons_1189 maxNumberOfBalloons_1189 = new MaxNumberOfBalloons_1189();
        assertEquals(2, maxNumberOfBalloons_1189.maxNumberOfBalloons("loonbalxballpoon"));
    }

    @Test
    public void maxNumberOfBalloons_3() {
        MaxNumberOfBalloons_1189 maxNumberOfBalloons_1189 = new MaxNumberOfBalloons_1189();
        assertEquals(0, maxNumberOfBalloons_1189.maxNumberOfBalloons("leetcode"));
    }

}