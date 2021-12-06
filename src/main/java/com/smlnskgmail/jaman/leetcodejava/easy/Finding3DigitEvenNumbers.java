package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/finding-3-digit-even-numbers
public class Finding3DigitEvenNumbers {

    private final int[] input;

    public Finding3DigitEvenNumbers(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] nums = new int[1000];
        for (int num : input) {
            nums[num]++;
        }
        List<Integer> possibleNums = new ArrayList<>();
        for (int i = 100; i < 1000; i += 2) {
            int num = i;
            int[] digitsInNum = new int[10];
            while (num > 0) {
                digitsInNum[num % 10]++;
                num /= 10;
            }
            boolean isValid = true;
            for (int j = 0; j < digitsInNum.length; j++) {
                int count = digitsInNum[j];
                if (count != 0) {
                    int original = nums[j];
                    if (original == 0 || original < count) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) {
                possibleNums.add(i);
            }
        }
        int[] result = new int[possibleNums.size()];
        for (int i = 0; i < possibleNums.size(); i++) {
            result[i] = possibleNums.get(i);
        }
        return result;
    }

}
