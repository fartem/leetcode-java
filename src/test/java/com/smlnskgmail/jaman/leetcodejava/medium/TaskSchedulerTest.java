package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskSchedulerTest {

    @Test
    public void defaultTest() {
        assertEquals(
                8,
                new TaskScheduler(
                        new char[]{'A', 'A', 'A', 'B', 'B', 'B'},
                        2
                ).solution()
        );
    }

}
