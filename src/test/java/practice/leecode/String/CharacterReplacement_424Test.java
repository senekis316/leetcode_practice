package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplacement_424Test {

    @Test
    public void characterReplacement_1() {
        CharacterReplacement_424 characterReplacement_424 = new CharacterReplacement_424();
        assertEquals(4, characterReplacement_424.characterReplacement("ABAB", 2));
    }

    @Test
    public void characterReplacement_2() {
        CharacterReplacement_424 characterReplacement_424 = new CharacterReplacement_424();
        assertEquals(4, characterReplacement_424.characterReplacement("AABABBA", 1));
    }

    @Test
    public void characterReplacement_3() {
        CharacterReplacement_424 characterReplacement_424 = new CharacterReplacement_424();
        assertEquals(4, characterReplacement_424.characterReplacement("AAAA", 0));
    }

    @Test
    public void characterReplacement_4() {
        CharacterReplacement_424 characterReplacement_424 = new CharacterReplacement_424();
        assertEquals(3, characterReplacement_424.characterReplacement("BAAA", 0));
    }

}