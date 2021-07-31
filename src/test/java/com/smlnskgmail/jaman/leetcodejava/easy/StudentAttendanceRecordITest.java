package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StudentAttendanceRecordITest {

    @Test
    public void defaultTest() {
        assertTrue(
                new StudentAttendanceRecordI(
                        "PPALLP"
                ).solution()
        );
    }

}
