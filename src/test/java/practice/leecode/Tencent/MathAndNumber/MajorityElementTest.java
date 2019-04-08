package practice.leecode.Tencent.MathAndNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void majorityElement() {
        MajorityElement majorityElement = new MajorityElement();
        assertEquals(3, majorityElement.majorityElement(new int[]{3,2,3}));
        assertEquals(2, majorityElement.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}