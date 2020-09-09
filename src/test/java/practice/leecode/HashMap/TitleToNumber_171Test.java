package practice.leecode.HashMap;

import org.junit.Test;

import static org.junit.Assert.*;

public class TitleToNumber_171Test {

    @Test
    public void titleToNumberTest_1() {
        TitleToNumber_171 titleToNumber_171 = new TitleToNumber_171();
        assertEquals(1, titleToNumber_171.titleToNumber("A"));
    }

    @Test
    public void titleToNumberTest_2() {
        TitleToNumber_171 titleToNumber_171 = new TitleToNumber_171();
        assertEquals(28, titleToNumber_171.titleToNumber("AB"));
    }

    @Test
    public void titleToNumberTest_3() {
        TitleToNumber_171 titleToNumber_171 = new TitleToNumber_171();
        assertEquals(701, titleToNumber_171.titleToNumber("ZY"));
    }

}