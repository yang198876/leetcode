package com.company;

public class SkyLine {
    public int maxIncreaseKiipingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] columnMax = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > rowMax[i]) {
                    rowMax[i] = grid[i][j];
                }
                if (grid[i][j] > columnMax[j]) {
                    columnMax[j] = grid[i][j];
                }
            }
        }

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result += (Math.min(rowMax[i], columnMax[j]) - grid[i][j]);
            }
        }
        return result;
    }
}
