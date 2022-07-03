package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeNeededToInformAllEmployeesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new TimeNeededToInformAllEmployees(
                        1,
                        0,
                        new int[]{-1},
                        new int[]{0}
                ).solution()
        );
    }

}
