package practice.leecode.qq;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintLettersToShapeZTest {

    @Test
    public void convert() {

        /**
         *  L   C   I   R
         *  E T O E S I I G
         *  E   D   H   N
         */

        PrintLettersToShapeZ printLettersToShapeZ = new PrintLettersToShapeZ();

        assertEquals("LCIRETOESIIGEDHN", printLettersToShapeZ.convert("LEETCODEISHIRING", 3));
        //assertEquals("LDREOEIIECIHNTSG", printLettersToShapeZ.convert("LEETCODEISHIRING", 4));

    }
}