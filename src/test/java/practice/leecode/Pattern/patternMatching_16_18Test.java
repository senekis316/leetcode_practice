package practice.leecode.Pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class patternMatching_16_18Test {

    @Test
    public void patternMatching_1() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertTrue(patternMatching_16_18.patternMatching("abba", "dogcatcatdog"));
    }

    @Test
    public void patternMatching_2() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertFalse(patternMatching_16_18.patternMatching("abba", "dogcatcatfish"));
    }

    @Test
    public void patternMatching_3() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertFalse(patternMatching_16_18.patternMatching("aaaa", "dogcatcatdog"));
    }

    @Test
    public void patternMatching_4() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertTrue(patternMatching_16_18.patternMatching("abba", "dogdogdogdog"));
    }

    @Test
    public void patternMatching_5() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertFalse(patternMatching_16_18.patternMatching("bbaba", "ajocitdfyhohchqvilvdjjocitdfyhohchqvilvdj"));
    }

    // 1:1:true
    // 1:2:false
    // 3:1:false
    // 2:1:true

    @Test
    public void patternMatching_6() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertTrue(patternMatching_16_18.patternMatching("", ""));
    }

    @Test
    public void patternMatching_7() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertFalse(patternMatching_16_18.patternMatching("", "x"));
    }

    @Test
    public void patternMatching_8() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertFalse(patternMatching_16_18.patternMatching("ab", ""));
    }

    @Test
    public void patternMatching_9() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertTrue(patternMatching_16_18.patternMatching("a", ""));
    }

    @Test
    public void patternMatching_10() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertTrue(patternMatching_16_18.patternMatching("bbbaa", "xxxxxx"));
    }

    @Test
    public void patternMatching_11() {
        PatternMatching_16_18 patternMatching_16_18 = new PatternMatching_16_18();
        assertTrue(patternMatching_16_18.patternMatching("bbbaa", "xxxxxxxy"));
    }


}