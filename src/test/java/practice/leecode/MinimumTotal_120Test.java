package practice.leecode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MinimumTotal_120Test {

    @Test
    public void minimumTotal() {

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);

        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);

        MinimumTotal_120 minimumTotal_120 = new MinimumTotal_120();
        assertEquals(11, minimumTotal_120.minimumTotal(triangle));

    }
}