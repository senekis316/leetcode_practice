package practice.leecode.Arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class AddToArrayForm_989Test {

    @Test
    public void addToArrayForm_1() {
        AddToArrayForm_989 addToArrayForm_989 = new AddToArrayForm_989();
        Integer[] result = addToArrayForm_989.addToArrayForm(new int[]{1,2,0,0}, 34).stream().toArray(Integer[]::new);
        Integer[] expect = new Integer[]{1,2,3,4};
        assertArrayEquals(expect, result);
    }

    @Test
    public void addToArrayForm_2() {
        AddToArrayForm_989 addToArrayForm_989 = new AddToArrayForm_989();
        Integer[] result = addToArrayForm_989.addToArrayForm(new int[]{2,7,4}, 181).stream().toArray(Integer[]::new);
        Integer[] expect = new Integer[]{4,5,5};
        assertArrayEquals(expect, result);
    }

    @Test
    public void addToArrayForm_3() {
        AddToArrayForm_989 addToArrayForm_989 = new AddToArrayForm_989();
        Integer[] result = addToArrayForm_989.addToArrayForm(new int[]{2,1,5}, 806).stream().toArray(Integer[]::new);
        Integer[] expect = new Integer[]{1,0,2,1};
        assertArrayEquals(expect, result);
    }

    @Test
    public void addToArrayForm_4() {
        AddToArrayForm_989 addToArrayForm_989 = new AddToArrayForm_989();
        Integer[] result = addToArrayForm_989.addToArrayForm(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3}, 516).stream().toArray(Integer[]::new);
        Integer[] expect = new Integer[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9};
        assertArrayEquals(expect, result);
    }

}