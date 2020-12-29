package practice.leecode.Geometric;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurfaceArea_892Test {

    @Test
    public void surfaceArea_1() {
        SurfaceArea_892 surfaceArea_892 = new SurfaceArea_892();
        assertEquals(10, surfaceArea_892.surfaceArea(new int[][]{{2}}));
    }

    @Test
    public void surfaceArea_2() {
        SurfaceArea_892 surfaceArea_892 = new SurfaceArea_892();
        assertEquals(34, surfaceArea_892.surfaceArea(new int[][]{{1,2},{3,4}}));
    }

    @Test
    public void surfaceArea_3() {
        SurfaceArea_892 surfaceArea_892 = new SurfaceArea_892();
        assertEquals(16, surfaceArea_892.surfaceArea(new int[][]{{1,0},{0,2}}));
    }

    @Test
    public void surfaceArea_4() {
        SurfaceArea_892 surfaceArea_892 = new SurfaceArea_892();
        assertEquals(32, surfaceArea_892.surfaceArea(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));
    }

    @Test
    public void surfaceArea_5() {
        SurfaceArea_892 surfaceArea_892 = new SurfaceArea_892();
        assertEquals(46, surfaceArea_892.surfaceArea(new int[][]{{2,2,2},{2,1,2},{2,2,2}}));
    }

}