package practice.leecode.Geometric;

public class SurfaceArea_892 {

    public int surfaceArea(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length - 1; j++) {
                area += Math.abs(grid[i][j] - grid[i][j + 1]);
            }
            area += grid[i][0] + grid[i][grid.length - 1];
        }
        for (int j = 0; j < grid.length; j++) {
            for (int i = 0; i < grid.length - 1; i++) {
                area += Math.abs(grid[i][j] - grid[i + 1][j]);
            }
            area += grid[0][j] + grid[grid.length - 1][j];
        }
        for (int i = 0;  i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > 0) {
                    area += 2;
                }
            }
        }
        return area;
    }

}
