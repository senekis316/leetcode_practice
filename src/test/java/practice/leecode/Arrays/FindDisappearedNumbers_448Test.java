package practice.leecode.Arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FindDisappearedNumbers_448Test {

    @Test
    public void findDisappearedNumbers() {
        FindDisappearedNumbers_448 findDisappearedNumbers_448 = new FindDisappearedNumbers_448();
        List<Integer> res = findDisappearedNumbers_448.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        assertEquals(res.get(0).intValue(), 5);
        assertEquals(res.get(1).intValue(), 6);
    }
}