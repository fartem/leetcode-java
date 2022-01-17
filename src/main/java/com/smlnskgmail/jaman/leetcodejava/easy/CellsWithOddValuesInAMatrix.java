package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix
public class CellsWithOddValuesInAMatrix {

    private final int m;
    private final int n;
    private final int[][] indices;

    public CellsWithOddValuesInAMatrix(int m, int n, int[][] indices) {
        this.m = m;
        this.n = n;
        this.indices = indices;
    }

    public int solution() {
        int[] column = new int[m];
        int[] row = new int[n];
        for (int[] index : indices) {
            int columnIndex = index[0];
            column[columnIndex] = column[columnIndex] + 1;

            int rowIndex = index[1];
            row[rowIndex] = row[rowIndex] + 1;
        }

        int columnOdds = 0;
        for (int num : column) {
            if (num % 2 != 0) {
                columnOdds++;
            }
        }

        int rowOdds = 0;
        for (int num : row) {
            if (num % 2 != 0) {
                rowOdds++;
            }
        }
        return columnOdds * (n - rowOdds) + rowOdds * (m - columnOdds);
    }
}
