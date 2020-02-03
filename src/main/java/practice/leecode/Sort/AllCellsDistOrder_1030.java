package practice.leecode.Sort;

public class AllCellsDistOrder_1030 {

//    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
//        int[][] elements = new int[R * C - 1][];
//        int pos = 1;
//        int distance = 0;
//    }
//
//    private int maxDistance(int R, int C, int r0, int c0) {
//        int lu = r0 + c0;
//        int ru = r0 + (C - c0);
//        int lb = (R - r0) + c0;
//        int rb = (R - r0) + (C - c0);
//        int ud = Math.
//    }

    /*public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {

        int pos = 0;
        int[][] elements = new int[R * C - 1][];
        for (int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if (i != r0 || j != c0) {
                    int[] element = {i, j};
                    elements[pos++] = element;
                }
            }
        }

        int[] distances = new int[pos];
        for (int i = 0; i < elements.length; i++) {
            distances[i] = Math.abs(elements[i][0] - r0) + Math.abs(elements[i][1] - c0);
        }

        return elements;
    }*/


}
