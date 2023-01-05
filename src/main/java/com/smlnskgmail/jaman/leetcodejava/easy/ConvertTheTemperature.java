package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/convert-the-temperature/
public class ConvertTheTemperature {

    private final double input;

    public ConvertTheTemperature(double celsius) {
        this.input = celsius;
    }

    public double[] solution() {
        return new double[]{
                input + 273.15,
                input * 1.80 + 32.00
        };
    }

}
