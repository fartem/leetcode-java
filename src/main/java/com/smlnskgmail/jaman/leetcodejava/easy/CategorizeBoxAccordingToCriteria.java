package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/categorize-box-according-to-criteria/
public class CategorizeBoxAccordingToCriteria {

    private final int length;
    private final int width;
    private final int height;
    private final int mass;

    public CategorizeBoxAccordingToCriteria(
            int length,
            int width,
            int height,
            int mass
    ) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.mass = mass;
    }

    public String solution() {
        long volume = (long) length * width * height;
        boolean isBulky = length >= Math.pow(10, 4)
                || width >= Math.pow(10, 4)
                || height >= Math.pow(10, 4)
                || volume >= Math.pow(10, 9);
        boolean isHeavy = mass >= 100;
        if (isBulky && isHeavy) {
            return "Both";
        }
        if (!isBulky && !isHeavy) {
            return "Neither";
        }
        return isBulky ? "Bulky" : "Heavy";
    }

}
