package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindTargetIndicesAfterSortingArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(1, 2),
                new FindTargetIndicesAfterSortingArray(
                        new int[]{1, 2, 5, 2, 3},
                        2
                ).solution()
        );
    }

}
