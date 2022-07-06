package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

import java.util.Arrays;

// https://leetcode.com/problems/spiral-matrix-iv/
public class SpiralMatrixIV {

    private final int m;
    private final int n;
    private final ListNode head;

    public SpiralMatrixIV(int m, int n, ListNode head) {
        this.m = m;
        this.n = n;
        this.head = head;
    }

    public int[][] solution() {
        int[][] result = new int[m][n];
        for (int[] r : result) {
            Arrays.fill(r, -1);
        }
        ListNode node = head;
        int sR = 0;
        int sC = 0;
        int eR = m - 1;
        int eC = n - 1;
        while (node != null) {
            for (int i = sC; i <= eC; i++) {
                if (node == null) {
                    break;
                }
                result[sR][i] = node.val;
                node = node.next;
            }
            for (int i = sR + 1; i <= eR; i++) {
                if (node == null) {
                    break;
                }
                result[i][eC] = node.val;
                node = node.next;
            }
            for (int i = eC - 1; i >= sC; i--) {
                if (node == null) {
                    break;
                }
                result[eR][i] = node.val;
                node = node.next;
            }
            for (int i = eR - 1; i > sR; i--) {
                if (node == null) {
                    break;
                }
                result[i][sC] = node.val;
                node = node.next;
            }
            sR++;
            sC++;
            eR--;
            eC--;
        }
        return result;
    }

}
