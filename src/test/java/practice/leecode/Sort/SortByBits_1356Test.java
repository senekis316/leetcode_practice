package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortByBits_1356Test {

    @Test
    public void sortByBits_1() {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8};
        SortByBits_1356 sortByBits_1356 = new SortByBits_1356();
        assertArrayEquals(new int[]{0,1,2,4,8,3,5,6,7}, sortByBits_1356.sortByBits(arr));
    }

    @Test
    public void sortByBits_2() {
        int[] arr = new int[]{1024,128,512,256,64,32,16,8,4,2,1};
        SortByBits_1356 sortByBits_1356 = new SortByBits_1356();
        assertArrayEquals(new int[]{1,2,4,8,16,32,64,128,256,512,1024}, sortByBits_1356.sortByBits(arr));
    }

    @Test
    public void sortByBits_3() {
        int[] arr = new int[]{10000,10000};
        SortByBits_1356 sortByBits_1356 = new SortByBits_1356();
        assertArrayEquals(new int[]{10000,10000}, sortByBits_1356.sortByBits(arr));
    }

    @Test
    public void sortByBits_4() {
        int[] arr = new int[]{2,3,5,7,11,13,17,19};
        SortByBits_1356 sortByBits_1356 = new SortByBits_1356();
        assertArrayEquals(new int[]{2,3,5,17,7,11,13,19}, sortByBits_1356.sortByBits(arr));
    }

    @Test
    public void sortByBits_5() {
        int[] arr = new int[]{10,100,1000,10000};
        SortByBits_1356 sortByBits_1356 = new SortByBits_1356();
        assertArrayEquals(new int[]{10,100,10000,1000}, sortByBits_1356.sortByBits(arr));
    }

}