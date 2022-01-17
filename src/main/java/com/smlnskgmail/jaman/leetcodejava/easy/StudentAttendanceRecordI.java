package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/student-attendance-record-i
public class StudentAttendanceRecordI {

    private final String input;

    public StudentAttendanceRecordI(String input) {
        this.input = input;
    }

    public boolean solution() {
        int absent = 0;
        int late = 0;
        char prev = 'P';
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'L') {
                late++;
            } else {
                if (c == 'A') {
                    absent++;
                }
                if (late < 3) {
                    late = 0;
                }
            }
            prev = c;
        }
        return absent < 2 && late < 3;
    }
}
