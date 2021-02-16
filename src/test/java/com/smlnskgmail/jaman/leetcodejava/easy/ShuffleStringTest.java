package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShuffleStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "leetcode",
                new ShuffleString(
                        "codeleet",
                        new int[]{4, 5, 6, 7, 0, 2, 1, 3}
                ).solution()
        );
    }

}
