package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SummaryRangesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("0->2", "4->5", "7"),
                new SummaryRanges(new int[]{0, 1, 2, 4, 5, 7}).solution()
        );
    }

}
