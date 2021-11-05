package practice.leecode.Dynamic;

public class TrapRainWater_407 {

    public int trapRainWater(int[][] heightMap) {
        int res = 0;
        for (int i = 1; i < heightMap.length - 1; i++) {
            for (int j = 1; j < heightMap[i].length - 1; j++) {
                int save = Math.min(
                    Math.min(heightMap[i][j - 1], heightMap[i][j + 1]),
                    Math.min(heightMap[i - 1][j], heightMap[i + 1][j])
                );
                if (save > heightMap[i][j]) {
                    res += save - heightMap[i][j];
                }
            }
        }
        return res;
    }


//    private int[][][] cellMap;
//
//    public int trapRainWater(int[][] heightMap) {
//
//        // 获取最大高度
//        int maxHeight = Integer.MIN_VALUE;
//        for (int i = 0; i < heightMap.length; i++) {
//            for (int j = 0; j < heightMap[i].length; j++) {
//                maxHeight = Math.max(maxHeight, heightMap[i][j]);
//            }
//        }
//
//        // 初始化缓存矩阵
//        cellMap = new int[heightMap.length][heightMap[0].length][maxHeight];
//        for (int i = 0; i < heightMap.length; i++) {
//            for (int j = 0; j < heightMap[i].length; j++) {
//                for (int z = 0; z < heightMap[i][j]; z++) {
//                    cellMap[i][j][z] = 1;
//                }
//            }
//        }
//
//        // 判断单元是否可以蓄水
//        int res = 0;
//        for (int i = 1; i < cellMap.length - 1; i++) {
//            for (int j = 1; j < cellMap[i].length - 1; j++) {
//                for (int z = heightMap[i][j]; z < maxHeight; z++) {
//                    if (save(i, j, z)) {
//                        res++;
//                    }
//                }
//            }
//        }
//        return res;
//    }
//
//    private boolean save(int i, int j, int z) {
//        if (i < 0 || j < 0 || i == cellMap.length || j == cellMap[0].length) return true;
//        if (cellMap[i][j][z] == -1) {
//            return false;
//        }
//        if ((i == 0 || j == 0 || i == cellMap.length - 1 || j == cellMap[0].length - 1)) {
//            if (cellMap[i][j][z] == 0) {
//                cellMap[i][j][z] = -1;
//                return false;
//            } else {
//                return true;
//            }
//        }
//        return (save(i - 1, j, z) && save(i, j - 1, z))
//                && (save(i - 1, j, z) && save(i, j + 1, z))
//                && (save(i + 1, j, z) && save(i, j - 1, z))
//                && (save(i + 1, j, z) && save(i, j + 1, z));
//    }

}
