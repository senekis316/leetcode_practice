package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetKth_1387Test {

    @Test
    public void getKth_1() {
        GetKth_1387 getKth_1387 = new GetKth_1387();
        assertEquals(13, getKth_1387.getKth(12, 15, 2));
    }

    @Test
    public void getKth_2() {
        GetKth_1387 getKth_1387 = new GetKth_1387();
        assertEquals(1, getKth_1387.getKth(1, 1, 1));
    }

    @Test
    public void getKth_3() {
        GetKth_1387 getKth_1387 = new GetKth_1387();
        assertEquals(7, getKth_1387.getKth(7, 11, 4));
    }

    @Test
    public void getKth_4() {
        GetKth_1387 getKth_1387 = new GetKth_1387();
        assertEquals(13, getKth_1387.getKth(10, 20, 5));
    }

    @Test
    public void getKth_5() {
        GetKth_1387 getKth_1387 = new GetKth_1387();
        assertEquals(570, getKth_1387.getKth(1, 1000, 777));
    }

}