package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DetermineIfTwoEventsHaveConflictTest {

    @Test
    public void defaultTests() {
        assertTrue(
                new DetermineIfTwoEventsHaveConflict(
                        new String[]{"01:15", "02:00"},
                        new String[]{"02:00", "03:00"}
                ).solution()
        );
        assertTrue(
                new DetermineIfTwoEventsHaveConflict(
                        new String[]{"01:00", "02:00"},
                        new String[]{"01:20", "03:00"}
                ).solution()
        );
        assertFalse(
                new DetermineIfTwoEventsHaveConflict(
                        new String[]{"10:00", "11:00"},
                        new String[]{"14:00", "15:00"}
                ).solution()
        );
    }

}
