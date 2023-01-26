package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumRecolorsToGetKConsecutiveBlackBlocksTest {

    @Test
    public void defaultTests() {
        assertEquals(
                3,
                new MinimumRecolorsToGetKConsecutiveBlackBlocks(
                        "WBBWWBBWBW",
                        7
                ).solution()
        );
        assertEquals(
                0,
                new MinimumRecolorsToGetKConsecutiveBlackBlocks(
                        "WBWBBBW",
                        2
                ).solution()
        );
    }

}
