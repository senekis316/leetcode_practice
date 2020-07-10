package practice.leecode.Arrays;

import java.util.Arrays;

public class KWeakestRows_1341 {

    public int[] kWeakestRows(int[][] mat, int k) {
        FightRow[] fightRows = new FightRow[mat.length];
        for (int row = 0; row < mat.length; row++) {
            int fight = 0;
            for (int col = 0; col < mat[row].length; col++) {
                fight += mat[row][col];
            }
            fightRows[row] = new FightRow(row, fight);
        }
        Arrays.sort(fightRows);
        int[] rows = new int[k];
        for (int i = 0; i < k; i++) {
            rows[i] = fightRows[i].row;
        }
        return rows;
    }

    public class FightRow implements Comparable<FightRow> {
        private int row;
        private int fight;
        public FightRow(int row, int fight) {
            this.row = row;
            this.fight = fight;
        }
        public void setRow(int row) {
            this.row = row;
        }
        public int getRow() {
            return this.row;
        }
        public void setFight(int row) {
            this.fight = fight;
        }
        public int getFight() {
            return this.fight;
        }
        @Override
        public int compareTo(FightRow f1) {
            if (this.fight < f1.fight) {
                return -1;
            } else if (this.fight > f1.fight) {
                return 1;
            } else {
                if (this.row < f1.row) {
                    return -1;
                } else if (this.row < f1.row) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

}
