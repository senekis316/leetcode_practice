package practice.leecode.qq;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalidromeNumber_9Test {

    @Test
    public void isPalindrome() {
        PalidromeNumber_9 palidromeNumber_9 = new PalidromeNumber_9();
        assertEquals(true, palidromeNumber_9.isPalindrome(121));
        assertEquals(false, palidromeNumber_9.isPalindrome(2147483647));
    }
}