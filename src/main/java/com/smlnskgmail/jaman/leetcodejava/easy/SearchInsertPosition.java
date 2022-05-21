package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    private final int[] array;
    private final int target;

    public SearchInsertPosition(int[] array, int target) {
        this.array = array;
        this.target = target;
    }

    public int solution() {
        if (array[array.length - 1] < target) {
            return array.length;
        }
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (array[m] < target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

}
