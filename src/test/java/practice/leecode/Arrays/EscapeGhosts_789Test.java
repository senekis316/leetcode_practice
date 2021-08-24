package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class EscapeGhosts_789Test {

    @Test
    public void escapeGhosts_1() {
        EscapeGhosts_789 escapeGhosts_789 = new EscapeGhosts_789();
        assertTrue(escapeGhosts_789.escapeGhosts(new int[][]{{1,0},{0,3}}, new int[]{0,1}));
    }

    @Test
    public void escapeGhosts_2() {
        EscapeGhosts_789 escapeGhosts_789 = new EscapeGhosts_789();
        assertFalse(escapeGhosts_789.escapeGhosts(new int[][]{{1,0}}, new int[]{2,0}));
    }

    @Test
    public void escapeGhosts_3() {
        EscapeGhosts_789 escapeGhosts_789 = new EscapeGhosts_789();
        assertFalse(escapeGhosts_789.escapeGhosts(new int[][]{{2,0}}, new int[]{1,0}));
    }

}