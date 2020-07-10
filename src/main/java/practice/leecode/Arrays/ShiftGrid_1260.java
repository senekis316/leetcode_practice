package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ShiftGrid_1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> new_grid = new ArrayList<>(grid.length);
        for (int i = 0; i < new_grid.size(); i++) {
            new_grid.add(new ArrayList<>(grid[0].length));
        }
        int m = grid.length;
        int n = grid[0].length;
        k %= m * n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int x = (j + k + 1) % n - 1;
                int y = ((j + k + 1) % n + i) % m;
                grid[x][y] = grid[i][j];
             }
        }
        System.out.println(grid);
        return null;
    }

}
