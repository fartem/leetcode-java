package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/robot-return-to-origin/
public class RobotReturnToOrigin {

    private final String input;

    public RobotReturnToOrigin(String input) {
        this.input = input;
    }

    public boolean solution() {
        int horizontal = 0;
        int vertical = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'U':
                    vertical += 1;
                    break;
                case 'D':
                    vertical += -1;
                    break;
                case 'L':
                    horizontal += 1;
                    break;
                case 'R':
                    horizontal += -1;
                    break;
            }
        }
        return horizontal == 0 && vertical == 0;
    }

}
