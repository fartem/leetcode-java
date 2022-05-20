package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-operations-to-obtain-zero/
public class CountOperationsToObtainZero {

    private int num1;
    private int num2;

    public CountOperationsToObtainZero(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int solution() {
        int num = Math.min(num1, num2);
        int result = 0;
        while (num != 0) {
            if (num1 >= num2) {
                num = num1 - num2;
                num1 = num;
            } else {
                num = num2 - num1;
                num2 = num;
            }
            result++;
        }
        return result;
    }

}
