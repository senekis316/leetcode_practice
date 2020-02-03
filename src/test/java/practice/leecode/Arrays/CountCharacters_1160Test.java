package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountCharacters_1160Test {

    @Test
    public void countCharacters_1() {
        String chars = "atach";
        String[] words = {"cat","bt","hat","tree"};
        CountCharacters_1160 CountCharacters_1160 = new CountCharacters_1160();
        assertEquals(6, CountCharacters_1160.countCharacters(words, chars));
    }

    @Test
    public void countCharacters_2() {
        String chars = "welldonehoneyr";
        String[] words = {"hello","world","leetcode"};
        CountCharacters_1160 CountCharacters_1160 = new CountCharacters_1160();
        assertEquals(10, CountCharacters_1160.countCharacters(words, chars));
    }

}