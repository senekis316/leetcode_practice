package practice.leecode.GraphTheory;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindJudge_997Test {

    @Test
    public void findJudge_1() {
        FindJudge_997 findJudge_997 = new FindJudge_997();
        assertEquals(2, findJudge_997.findJudge(2, new int[][]{{1,2}}));
    }

    @Test
    public void findJudge_2() {
        FindJudge_997 findJudge_997 = new FindJudge_997();
        assertEquals(3, findJudge_997.findJudge(3, new int[][]{{1,3},{2,3}}));
    }

    @Test
    public void findJudge_3() {
        FindJudge_997 findJudge_997 = new FindJudge_997();
        assertEquals(-1, findJudge_997.findJudge(3, new int[][]{{1,3},{2,3},{3,1}}));
    }

    @Test
    public void findJudge_4() {
        FindJudge_997 findJudge_997 = new FindJudge_997();
        assertEquals(-1, findJudge_997.findJudge(3, new int[][]{{1,2},{2,3}}));
    }

    @Test
    public void findJudge_5() {
        FindJudge_997 findJudge_997 = new FindJudge_997();
        assertEquals(3, findJudge_997.findJudge(4, new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}}));
    }

    @Test
    public void findJudge_6() {
        FindJudge_997 findJudge_997 = new FindJudge_997();
        assertEquals(1, findJudge_997.findJudge(1, new int[][]{}));
    }

}
