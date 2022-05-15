package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/number-of-laser-beams-in-a-bank
public class NumberOfLaserBeamsInABank {

    private final String[] input;

    public NumberOfLaserBeamsInABank(String[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        List<Integer> lasers = new ArrayList<>();
        for (String b : input) {
            int lasersAtB = 0;
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == '1') {
                    lasersAtB++;
                }
            }
            if (lasersAtB != 0) {
                lasers.add(lasersAtB);
            }
        }
        for (int i = 1; i < lasers.size(); i++) {
            result += lasers.get(i - 1) * lasers.get(i);
        }
        return result;
    }

}
