package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/flood-fill/
public class FloodFill {

    private final int[][] image;
    private final int sr;
    private final int sc;
    private final int color;

    public FloodFill(int[][] image, int sr, int sc, int color) {
        this.image = image;
        this.sr = sr;
        this.sc = sc;
        this.color = color;
    }

    public int[][] solution() {
        int c = image[sr][sc];
        if (c != color) {
            dfs(image, sr, sc, c, color);
        }
        return image;
    }

    private void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r >= 1) {
                dfs(image, r - 1, c, color, newColor);
            }
            if (c >= 1) {
                dfs(image, r, c - 1, color, newColor);
            }
            if (r + 1 < image.length) {
                dfs(image, r + 1, c, color, newColor);
            }
            if (c + 1 < image[0].length) {
                dfs(image, r, c + 1, color, newColor);
            }
        }
    }

}
