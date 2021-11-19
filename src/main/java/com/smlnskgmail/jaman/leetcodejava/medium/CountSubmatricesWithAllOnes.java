package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayDeque;

// https://leetcode.com/problems/count-submatrices-with-all-ones
public class CountSubmatricesWithAllOnes {

    private final int[][] mat;

    public CountSubmatricesWithAllOnes(int[][] input) {
        this.mat = input;
    }

    public int solution() {
        int n = mat[0].length;
        int result = 0;
        int[] h = new int[n];
        for (int[] sub : mat) {
            ArrayDeque<Integer> f = new ArrayDeque<>();
            ArrayDeque<Integer> s = new ArrayDeque<>();
            f.addFirst(-1);
            s.addFirst(0);
            for (int j = 0; j < n; j++) {
                h[j] = (sub[j] == 0 ? 0 : h[j] + 1);
            }
            for (int j = 0; j < n; j++) {
                while (f.peekFirst() >= 0 && h[f.peekFirst()] >= h[j]) {
                    f.removeFirst();
                    s.removeFirst();
                }
                int sum = h[j] * (j - f.peekFirst()) + s.peekFirst();
                f.addFirst(j);
                s.addFirst(sum);
                result += sum;
            }
        }
        return result;
    }

}
