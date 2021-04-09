package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberAtLeastTwiceOfOthersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new LargestNumberAtLeastTwiceOfOthers(
                        new int[]{0, 0, 0, 1}
                ).solution()
        );
    }

}
