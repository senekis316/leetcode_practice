package practice.leecode.Tencent;

import org.junit.Test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Hashtable;

import static org.junit.Assert.*;

public class ClimbStairsTest {

    @Test
    public void climbStairs() {

        ClimbStairs climbStairs = new ClimbStairs();
        assertEquals(1, climbStairs.climbStairs(1));
        assertEquals(2, climbStairs.climbStairs(2));
        assertEquals(3, climbStairs.climbStairs(3));

    }
}