package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheMatrixDiagonally {

    private final int[][] input;

    public SortTheMatrixDiagonally(int[][] input) {
        this.input = input;
    }

    public int[][] solution() {
        int rows = input.length;
        int cols = input[0].length;
        List<Integer> diagonals;
        for (int r = 0; r < rows; r++) {
            int i = r;
            int j = 0;
            diagonals = new ArrayList<>();
            while (i < rows && j < cols) {
                diagonals.add(input[i++][j++]);
            }
            Collections.sort(diagonals);
            i = r;
            j = 0;
            int k = 0;
            while (i < rows && j < cols) {
                input[i++][j++] = diagonals.get(k++);
            }
        }
        for (int c = 0; c < cols; c++) {
            int i = 0;
            int j = c;
            diagonals = new ArrayList<>();
            while (i < rows && j < cols) {
                diagonals.add(input[i++][j++]);
            }
            Collections.sort(diagonals);
            i = 0;
            j = c;
            int k = 0;
            while (i < rows && j < cols) {
                input[i++][j++] = diagonals.get(k++);
            }
        }
        return input;
    }

}
