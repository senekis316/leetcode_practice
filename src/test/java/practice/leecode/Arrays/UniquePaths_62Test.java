package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePaths_62Test {

    @Test
    public void uniquePaths_1() {
        UniquePaths_62 uniquePaths_62 = new UniquePaths_62();
        assertEquals(3, uniquePaths_62.uniquePaths(3,2));
    }

    @Test
    public void uniquePaths_2() {
        UniquePaths_62 uniquePaths_62 = new UniquePaths_62();
        assertEquals(28, uniquePaths_62.uniquePaths(7,3));
    }

}