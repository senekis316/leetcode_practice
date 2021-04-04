package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Trap_1721Test {

    @Test
    public void trap() {
        Trap_1721 trap_1721 = new Trap_1721();
        assertEquals(6, trap_1721.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

}