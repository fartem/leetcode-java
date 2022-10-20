package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheEmployeeThatWorkedOnTheLongestTaskTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new TheEmployeeThatWorkedOnTheLongestTask(
                        10,
                        new int[][]{{0, 3}, {2, 5}, {0, 9}, {1, 15}}
                ).solution()
        );
    }

}
