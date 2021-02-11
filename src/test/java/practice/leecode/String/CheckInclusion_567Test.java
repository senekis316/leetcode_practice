package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckInclusion_567Test {

    @Test
    public void checkInclusion_1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        CheckInclusion_567 CheckInclusion_567 = new CheckInclusion_567();
        assertTrue(CheckInclusion_567.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        CheckInclusion_567 CheckInclusion_567 = new CheckInclusion_567();
        assertFalse(CheckInclusion_567.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_3() {
        String s1 = "hello";
        String s2 = "ooolleoooleh";
        CheckInclusion_567 CheckInclusion_567 = new CheckInclusion_567();
        assertFalse(CheckInclusion_567.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_4() {
        String s1 = "adc";
        String s2 = "dcda";
        CheckInclusion_567 CheckInclusion_567 = new CheckInclusion_567();
        assertTrue(CheckInclusion_567.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_5() {
        String s1 = "mart";
        String s2 = "karma";
        CheckInclusion_567 CheckInclusion_567 = new CheckInclusion_567();
        assertFalse(CheckInclusion_567.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_6() {
        String s1 = "dinitrophenylhydrazine";
        String s2 = "acetylphenylhydrazine";
        CheckInclusion_567 CheckInclusion_567 = new CheckInclusion_567();
        assertFalse(CheckInclusion_567.checkInclusion(s1, s2));
    }

}