package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/design-parking-system/
public class DesignParkingSystem {

    private int big;
    private int medium;
    private int small;

    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (big - 1 >= 0) {
                    big--;
                    return true;
                }
                return false;
            case 2:
                if (medium - 1 >= 0) {
                    medium--;
                    return true;
                }
                return false;
            default:
                if (small - 1 >= 0) {
                    small--;
                    return true;
                }
                return false;
        }
    }

}
