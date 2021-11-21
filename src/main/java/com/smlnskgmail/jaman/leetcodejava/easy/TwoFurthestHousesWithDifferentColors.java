package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/two-furthest-houses-with-different-colors
public class TwoFurthestHousesWithDifferentColors {

    private final int[] colors;

    public TwoFurthestHousesWithDifferentColors(int[] colors) {
        this.colors = colors;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = i; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    int diff = j - i;
                    if (diff > result) {
                        result = diff;
                    }
                }
            }
        }
        return result;
    }

}
