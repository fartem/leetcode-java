package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
public class MinimumRecolorsToGetKConsecutiveBlackBlocks {

    private final String blocks;
    private final int k;

    public MinimumRecolorsToGetKConsecutiveBlackBlocks(String blocks, int k) {
        this.blocks = blocks;
        this.k = k;
    }

    public int solution() {
        int n = blocks.length();
        int result = n;
        for (int r = 0, curr = 0; r < n; r++) {
            if (blocks.charAt(r) == 'B') {
                curr++;
            }
            if (r >= k && blocks.charAt(r - k) == 'B') {
                curr--;
            }
            result = Math.min(result, k - curr);
        }
        return result;
    }

}
