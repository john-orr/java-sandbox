package com.dev;

/**
 * Created by john-orr on 21/03/16.
 */
public class TheClockwiseSpiral {

    public static int[][] createSpiral(int N) {
        int[][] canvas = new int[N][N];
        if (N==1) {
            canvas[0][0] = 1;
            return canvas;
        }

        int row = 0;
        int col = 0;
        int curr = 1;
        NavMode mode = NavMode.RIGHT;
        while (curr <= N * N) {
            canvas[row][col] = curr++;
            if (mode == NavMode.RIGHT) {
                if (col + 1 < N && canvas[row][col + 1] == 0) {
                    col++;
                } else if (canvas[row + 1][col] == 0) {
                    mode = NavMode.DOWN;
                    row++;
                }
            } else if (mode == NavMode.DOWN) {
                if (row + 1 < N && canvas[row + 1][col] == 0) {
                    row++;
                } else if (canvas[row][col - 1] == 0) {
                    mode = NavMode.LEFT;
                    col--;
                }
            } else if (mode == NavMode.LEFT) {
                if (col - 1 >= 0 && canvas[row][col - 1] == 0) {
                    col--;
                } else if (canvas[row - 1][col] == 0) {
                    mode = NavMode.UP;
                    row--;
                }
            } else if (mode == NavMode.UP) {
                if (row - 1 >= 0 && canvas[row - 1][col] == 0) {
                    row--;
                } else if (canvas[row][col + 1] == 0) {
                    mode = NavMode.RIGHT;
                    col++;
                }
            }
        }

        return canvas;
    }

    private enum NavMode {
        RIGHT, DOWN, LEFT, UP
    }
}
