package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Search_704Test {

    @Test
    public void search_1() {
        Search_704 search_704 = new Search_704();
        assertEquals(4, search_704.search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    public void search_2() {
        Search_704 search_704 = new Search_704();
        assertEquals(-1, search_704.search(new int[]{-1,0,3,5,9,12}, 2));
    }

    @Test
    public void search_3() {
        Search_704 search_704 = new Search_704();
        assertEquals(1, search_704.search(new int[]{2,5}, 5));
    }

    @Test
    public void search_4() {
        Search_704 search_704 = new Search_704();
        assertEquals(-1, search_704.search(new int[]{2,5}, 0));
    }

}