package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class DetectCapitalUse_520Test {

    @Test
    public void detectCapitalUse_1() {
        DetectCapitalUse_520 detectCapitalUse_520 = new DetectCapitalUse_520();
        assertTrue(detectCapitalUse_520.detectCapitalUse("USA"));
    }

    @Test
    public void detectCapitalUse_2() {
        DetectCapitalUse_520 detectCapitalUse_520 = new DetectCapitalUse_520();
        assertFalse(detectCapitalUse_520.detectCapitalUse("FlaG"));
    }
}