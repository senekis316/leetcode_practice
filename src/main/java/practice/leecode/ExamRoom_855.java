package practice.leecode;

import java.util.List;

//TODO
public class ExamRoom_855 {

    private int in = 0;

    private int[] place;

    private Range selectedRange;

    private List<Range> selectableRanges;

    public ExamRoom_855(int n) {
        place = new int[n];
        selectedRange = new Range(0, n - 1);
    }

    public int seat() {
        if (in == 0) {
            place[0] = 1;
            in++;
            return 0;
        } else if (in == 1) {
            place[place.length - 1] = 1;
            in++;
            return place.length - 1;
        } else {
            int begin = selectedRange.begin;
            int end = selectedRange.end;
            int seat = begin + (end - begin) / 2;
        }
        return 0;
    }

    public void leave(int p) {

    }

    public int getIn() {
        return in;
    }

    public int[] getPlace() {
        return place;
    }

    public static class Range {

        private int begin;

        private int end;

        private int distance;

        public Range(int begin, int end) {
            this.begin = begin;
            this.end = end;
            this.distance = end - begin;
        }

        public int getBegin() {
            return begin;
        }

        public void setBegin(int begin) {
            this.begin = begin;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

    }

}
