package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PeakIndexInMountainArray_Offer_69Test {

    @Test
    public void peakIndexInMountainArray_1() {
        PeakIndexInMountainArray_Offer_69 peakIndexInMountainArray_Offer_69 = new PeakIndexInMountainArray_Offer_69();
        assertEquals(1, peakIndexInMountainArray_Offer_69.peakIndexInMountainArray(new int[]{0,1,0}));
    }

    @Test
    public void peakIndexInMountainArray_2() {
        PeakIndexInMountainArray_Offer_69 peakIndexInMountainArray_Offer_69 = new PeakIndexInMountainArray_Offer_69();
        assertEquals(2, peakIndexInMountainArray_Offer_69.peakIndexInMountainArray(new int[]{1,3,5,4,2}));
    }

    @Test
    public void peakIndexInMountainArray_3() {
        PeakIndexInMountainArray_Offer_69 peakIndexInMountainArray_Offer_69 = new PeakIndexInMountainArray_Offer_69();
        assertEquals(1, peakIndexInMountainArray_Offer_69.peakIndexInMountainArray(new int[]{0,10,5,2}));
    }

    @Test
    public void peakIndexInMountainArray_4() {
        PeakIndexInMountainArray_Offer_69 peakIndexInMountainArray_Offer_69 = new PeakIndexInMountainArray_Offer_69();
        assertEquals(2, peakIndexInMountainArray_Offer_69.peakIndexInMountainArray(new int[]{3,4,5,1}));
    }

    @Test
    public void peakIndexInMountainArray_5() {
        PeakIndexInMountainArray_Offer_69 peakIndexInMountainArray_Offer_69 = new PeakIndexInMountainArray_Offer_69();
        assertEquals(2, peakIndexInMountainArray_Offer_69.peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
    }

}