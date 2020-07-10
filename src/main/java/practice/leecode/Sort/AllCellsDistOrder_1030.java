package practice.leecode.Sort;

import java.util.ArrayList;
import java.util.List;

public class AllCellsDistOrder_1030 {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<List<Pos>> bucks = new ArrayList<>(R+C);
        for (int i = 0; i < R + C; i++) {
            bucks.add(new ArrayList<>());
        }
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                List<Pos> buck = bucks.get(distance(r, c, r0, c0));
                buck.add(new Pos(r, c));
            }
        }
        int index = 0;
        int[][] result = new int[R*C][2];
        for (List<Pos> buck : bucks) {
            for (Pos pos : buck) {
                result[index][0] = pos.r;
                result[index++][1] = pos.c;
            }
        }
        return result;
    }

    private int distance(int r1, int c1, int r2, int c2) {
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }

    private static class Pos {
        private int r;
        private int c;
        public Pos(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

}
