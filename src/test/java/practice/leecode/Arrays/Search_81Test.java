package practice.leecode.Arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class Search_81Test {

    @Test
    public void search_1() {
        Search_81 search_81 = new Search_81();
        assertTrue(search_81.search(new int[]{2,5,6,0,0,1,2}, 0));
    }

    @Test
    public void search_2() {
        Search_81 search_81 = new Search_81();
        assertFalse(search_81.search(new int[]{2,5,6,0,0,1,2}, 3));
    }

}