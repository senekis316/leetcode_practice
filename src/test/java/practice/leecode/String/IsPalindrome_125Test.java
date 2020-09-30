package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindrome_125Test {

    @Test
    public void isPalindrome_1() {
        IsPalindrome_125 isPalindrome_125 = new IsPalindrome_125();
        assertTrue(isPalindrome_125.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void isPalindrome_2() {
        IsPalindrome_125 isPalindrome_125 = new IsPalindrome_125();
        assertFalse(isPalindrome_125.isPalindrome("race a car"));
    }

    @Test
    public void isPalindrome_3() {
        IsPalindrome_125 isPalindrome_125 = new IsPalindrome_125();
        assertFalse(isPalindrome_125.isPalindrome("0P"));
    }

}