package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time
public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    private final int[] startTime;
    private final int[] endTime;
    private final int queryTime;

    public NumberOfStudentsDoingHomeworkAtAGivenTime(
            int[] startTime,
            int[] endTime,
            int queryTime
    ) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.queryTime = queryTime;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                result++;
            }
        }
        return result;
    }

}
