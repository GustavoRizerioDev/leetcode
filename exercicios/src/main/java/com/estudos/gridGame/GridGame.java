package com.estudos.gridGame;

public class GridGame {
    public long gridGame(int[][] grid) {
        long top = 0;
        long bottom = 0;
        for (int i = 0; i < grid[0].length; i++) {
            top += grid[0][i];
        }
        long result = top;
        for (int i = 0; i < grid[0].length; i++) {
            top -= grid[0][i];
            result = Math.min(result, Math.max(top, bottom));
            bottom += grid[1][i];
        }
        return result;
    }
}
