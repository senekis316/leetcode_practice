package practice.leecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetSum_371Test {

    @Test
    public void getSum() {
        GetSum_371 getSum_371 = new GetSum_371();
        assertEquals(3, getSum_371.getSum(1, 2));
        assertEquals(1, getSum_371.getSum(-2, 3));
    }
}