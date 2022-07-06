package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestConsecutiveSequenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new LongestConsecutiveSequence(new int[]{100, 4, 200, 1, 3, 2}).solution()
        );
    }

}
