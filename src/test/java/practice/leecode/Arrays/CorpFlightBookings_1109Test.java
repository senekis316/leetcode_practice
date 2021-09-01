package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CorpFlightBookings_1109Test {

    @Test
    public void corpFlightBookings_1() {
        int n = 5;
        int[][] bookings = new int[][]{{1,2,10},{2,3,20},{2,5,25}};
        CorpFlightBookings_1109 corpFlightBookings_1109 = new CorpFlightBookings_1109();
        int[] expect = new int[]{10,55,45,25,25};
        int[] actual = corpFlightBookings_1109.corpFlightBookings(bookings, n);
        assertArrayEquals(expect, actual);
    }

    @Test
    public void corpFlightBookings_2() {
        int n = 2;
        int[][] bookings = new int[][]{{1,2,10},{2,2,15}};
        CorpFlightBookings_1109 corpFlightBookings_1109 = new CorpFlightBookings_1109();
        int[] expect = new int[]{10,25};
        int[] actual = corpFlightBookings_1109.corpFlightBookings(bookings, n);
        assertArrayEquals(expect, actual);
    }

}