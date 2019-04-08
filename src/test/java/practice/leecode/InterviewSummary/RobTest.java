package practice.leecode.InterviewSummary;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobTest {

    @Test
    public void rob() {
        Rob rob = new Rob();
        //assertEquals(4, rob.rob(new int[]{1,2,3,1}));
        assertEquals(12, rob.rob(new int[]{2,7,9,3,1}));
    }

}