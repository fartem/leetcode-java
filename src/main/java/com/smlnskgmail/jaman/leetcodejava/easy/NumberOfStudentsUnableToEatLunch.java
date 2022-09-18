package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
class NumberOfStudentsUnableToEatLunch {

    private final int[] students;
    private final int[] sandwiches;

    NumberOfStudentsUnableToEatLunch(int[] students, int[] sandwiches) {
        this.students = students;
        this.sandwiches = sandwiches;
    }

    public int solution() {
        int[] arr = {0, 0};
        for (int s : students) {
            arr[s]++;
        }
        for (int s : sandwiches) {
            if (arr[s] == 0) {
                break;
            }
            arr[s]--;
        }
        return arr[0] + arr[1];
    }

}
