package practice.leecode.HashMap;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindWords_500Test {

    @Test
    public void findWords() {
        FindWords_500 FindWords_500 = new FindWords_500();
        assertArrayEquals(
            new String[]{"Alaska", "Dad"},
            FindWords_500.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }
}