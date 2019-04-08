package practice.leecode.BinarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPeakElementTest {

    @Test
    public void findPeakElement() {

        FindPeakElement findPeakElement = new FindPeakElement();
        assertEquals(2, findPeakElement.findPeakElement(new int[]{1,2,3,1}));

        int res = findPeakElement.findPeakElement(new int[]{1,2,1,3,5,6,4});
        assertTrue(res == 1 || res == 5);

        findPeakElement.findPeakElement(new int[]{2,1});


    }

}