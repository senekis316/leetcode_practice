package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPossibility_665Test {

    @Test
    public void checkPossibility_1() {
        CheckPossibility_665 checkPossibility_665 = new CheckPossibility_665();
        assertEquals(true, checkPossibility_665.checkPossibility(new int[]{4,2,3}));
    }

    @Test
    public void checkPossibility_2() {
        CheckPossibility_665 checkPossibility_665 = new CheckPossibility_665();
        assertEquals(false, checkPossibility_665.checkPossibility(new int[]{4,2,1}));
    }

    @Test
    public void checkPossibility_3() {
        CheckPossibility_665 checkPossibility_665 = new CheckPossibility_665();
        assertEquals(false, checkPossibility_665.checkPossibility(new int[]{3,4,2,3}));
    }

    @Test
    public void checkPossibility_4() {
        CheckPossibility_665 checkPossibility_665 = new CheckPossibility_665();
        assertEquals(true, checkPossibility_665.checkPossibility(new int[]{-1,4,2,3}));
    }

    @Test
    public void checkPossibility_5() {
        CheckPossibility_665 checkPossibility_665 = new CheckPossibility_665();
        assertEquals(true, checkPossibility_665.checkPossibility(new int[]{2,3,3,2,4}));
    }

}