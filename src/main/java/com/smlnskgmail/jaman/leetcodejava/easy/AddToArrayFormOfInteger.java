package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/
public class AddToArrayFormOfInteger {

    private final int[] num;
    private int k;

    public AddToArrayFormOfInteger(int[] num, int k) {
        this.num = num;
        this.k = k;
    }

    public List<Integer> solution() {
        List<Integer> result = new ArrayList<>();
        int kLength = (int) Math.log10(k) + 1;
        int pointer = 0;
        int additional = 0;
        while (pointer < kLength && pointer < num.length) {
            int kNum = k % 10;
            int nNum = num[num.length - pointer - 1];
            int sum = kNum + nNum;
            if (sum > 9) {
                sum -= 10 + additional;
                additional = 1;
            } else if (additional != 0) {
                sum += additional;
                if (sum < 10) {
                    additional = 0;
                } else {
                    sum = 0;
                }
            }
            result.add(sum);
            k = k / 10;
            pointer++;
        }
        if (kLength > pointer) {
            for (int i = pointer; i < kLength; i++) {
                int n = k % 10;
                k /= 10;
                if (additional != 0) {
                    n += additional;
                    if (n > 9) {
                        n -= 10;
                    } else {
                        additional = 0;
                    }
                }
                result.add(n);
            }
        }
        if (num.length > pointer) {
            for (int i = pointer + 1; i <= num.length; i++) {
                int n = num[num.length - i];
                if (additional != 0) {
                    n += additional;
                    if (n > 9) {
                        n -= 10;
                    } else {
                        additional = 0;
                    }
                }
                result.add(n);
            }
        }
        if (additional != 0) {
            result.add(1);
        }
        Collections.reverse(result);
        return result;
    }

}
