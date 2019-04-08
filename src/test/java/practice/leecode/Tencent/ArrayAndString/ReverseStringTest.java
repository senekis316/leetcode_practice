package practice.leecode.Tencent.ArrayAndString;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseString() {

        ReverseString reverseString = new ReverseString();

        char[] chars1 = new char[]{'h','e','l','l','o'};
        reverseString.reverseString(chars1);
        assertArrayEquals(new char[]{'o','l','l','e','h'}, chars1);

        char[] chars2 = new char[]{'H','a','n','n','a','h'};
        reverseString.reverseString(chars2);
        assertArrayEquals(new char[]{'h','a','n','n','a','H'}, chars2);

    }
}