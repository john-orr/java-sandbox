package com.dev;

import java.util.Arrays;

/**
 * Created by john-orr on 11/03/16.
 */
public class ConwayLife {

    public static int[][] getGeneration(int[][] cells, int generations) {
        for (int i = 0; i < generations; i++) {
            cells = nextGeneration(cells);
        }
        return cells;
    }

    private static int[][] nextGeneration(int[][] initState) {
        int[][] expandedInitState = new int[initState.length + 2][initState[0].length + 2];
        for (int i = 0; i < initState.length; i++) {
            System.arraycopy(initState[i], 0, expandedInitState[i + 1], 1, initState[i].length);
        }

        int[][] nextGen = new int[expandedInitState.length][expandedInitState[0].length];
        for (int i = 0; i < expandedInitState.length; i++) {
            for (int j = 0; j < expandedInitState[i].length; j++) {
                nextGen[i][j] = willBeAlive(expandedInitState, i, j) ? 1 : 0;
            }
        }
        return trim(nextGen);
    }

    private static int[][] trim(int[][] grid) {
        int firstRowWithLife = grid.length;
        int lastRowWithLife = 0;
        int firstColWithLife = grid[0].length;
        int lastColWithLife = -1;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    firstRowWithLife = Math.min(firstRowWithLife, row);
                    lastRowWithLife = Math.max(lastRowWithLife, row);
                    firstColWithLife = Math.min(firstColWithLife, col);
                    lastColWithLife = Math.max(lastColWithLife, col);
                }
            }
        }
        int[][] trimmedGrid = new int[lastRowWithLife - firstRowWithLife + 1][lastColWithLife - firstColWithLife + 1];
        for (int row = firstRowWithLife, i = 0; row <= lastRowWithLife; row++, i++) {
            System.arraycopy(grid[row], firstColWithLife, trimmedGrid[i], 0, trimmedGrid[i].length);
            //System.out.println(Arrays.toString(trimmedGrid[i]));
        }
        //System.out.println();
        return trimmedGrid;
    }

    private static boolean willBeAlive(int[][] state, int i, int j) {
        int self = state[i][j];
        int neighbours = 0;
        for (int k = Math.max(0, i - 1); k <= Math.min(state.length - 1, i + 1); k++) {
            for (int l = Math.max(0, j - 1); l <= Math.min(state[k].length - 1, j + 1); l++) {
                if (!(k == i && l == j)) {
                    // Don't count yourself
                    neighbours += state[k][l];
                }
            }
        }
        if (neighbours < 2) {
            return false;
        }
        if (neighbours == 2) {
            return self == 1;
        }
        return neighbours == 3;
    }
}
