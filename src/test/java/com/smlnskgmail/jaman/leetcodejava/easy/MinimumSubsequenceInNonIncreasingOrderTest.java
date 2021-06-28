package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MinimumSubsequenceInNonIncreasingOrderTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(10, 9),
                new MinimumSubsequenceInNonIncreasingOrder(
                        new int[]{4, 3, 10, 9, 8}
                ).solution()
        );
    }

}
