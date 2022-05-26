package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestRangeITest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new SmallestRangeI(new int[]{0, 10}, 2).solution()
        );
    }

}
