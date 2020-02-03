package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckRevealedIncreasing_950Test {

    @Test
    public void deckRevealedIncreasing() {
        DeckRevealedIncreasing_950 DeckRevealedIncreasing_950 = new DeckRevealedIncreasing_950();
        int[] res = DeckRevealedIncreasing_950.deckRevealedIncreasing(new int[]{17,13,11,2,3,5,7});
        assertArrayEquals(new int[]{2,13,3,11,5,17,7}, res);
    }
}