package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPrefixOfWord_1455Test {

    @Test
    public void isPrefixOfWord_1() {
        IsPrefixOfWord_1455 isPrefixOfWord_1455 = new IsPrefixOfWord_1455();
        assertEquals(4, isPrefixOfWord_1455.isPrefixOfWord("i love eating burger", "burg"));
    }

    @Test
    public void isPrefixOfWord_2() {
        IsPrefixOfWord_1455 isPrefixOfWord_1455 = new IsPrefixOfWord_1455();
        assertEquals(2, isPrefixOfWord_1455.isPrefixOfWord("this problem is an easy problem", "pro"));
    }

    @Test
    public void isPrefixOfWord_3() {
        IsPrefixOfWord_1455 isPrefixOfWord_1455 = new IsPrefixOfWord_1455();
        assertEquals(-1, isPrefixOfWord_1455.isPrefixOfWord("i am tired", "you"));
    }

    @Test
    public void isPrefixOfWord_4() {
        IsPrefixOfWord_1455 isPrefixOfWord_1455 = new IsPrefixOfWord_1455();
        assertEquals(4, isPrefixOfWord_1455.isPrefixOfWord("i use triple pillow", "pill"));
    }

    @Test
    public void isPrefixOfWord_5() {
        IsPrefixOfWord_1455 isPrefixOfWord_1455 = new IsPrefixOfWord_1455();
        assertEquals(-1, isPrefixOfWord_1455.isPrefixOfWord("hello from the other side", "they"));
    }

}