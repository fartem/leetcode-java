package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-the-distance-value-between-two-arrays
public class FindTheDistanceValueBetweenTwoArrays {

    private final int[] arr1;
    private final int[] arr2;
    private final int d;

    public FindTheDistanceValueBetweenTwoArrays(int[] arr1, int[] arr2, int d) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.d = d;
    }

    public int solution() {
        int count = 0;
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (Math.abs(num1 - num2) <= d) {
                    count++;
                    break;
                }
            }
        }
        return arr1.length - count;
    }
}
