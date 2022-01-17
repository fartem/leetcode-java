package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-good-triplets
public class CountGoodTriplets {

    private final int[] arr;
    private final int a;
    private final int b;
    private final int c;

    public CountGoodTriplets(int[] arr, int a, int b, int c) {
        this.arr = arr;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];
                if (Math.abs(first - second) <= a) {
                    if (Math.abs(first - second) <= a) {
                        for (int k = j + 1; k < arr.length; k++) {
                            int third = arr[k];
                            if (Math.abs(second - third) <= b && Math.abs(first - third) <= c) {
                                result++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
