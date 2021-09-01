package practice.leecode.Arrays;

public class CorpFlightBookings_1109 {

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] books = new int[n];
        for (int[] booking : bookings) {
            books[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                books[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; i++) {
            books[i] += books[i - 1];
        }
        return books;
    }

}
