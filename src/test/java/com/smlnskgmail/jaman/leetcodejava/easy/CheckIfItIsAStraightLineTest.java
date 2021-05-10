package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfItIsAStraightLineTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfItIsAStraightLine(
                        new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}
                ).solution()
        );
    }

}
