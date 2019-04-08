package practice.leecode.HashAndMapped;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelSequenceTest {

    @Test
    public void titleToNumber() {
        ExcelSequence excelSequence = new ExcelSequence();
        assertEquals(1, excelSequence.titleToNumber("A"));
        assertEquals(28, excelSequence.titleToNumber("AB"));
        assertEquals(701, excelSequence.titleToNumber("ZY"));
    }

}