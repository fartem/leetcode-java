package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class FindTargetIndicesAfterSortingArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(1, 2),
                new FindTargetIndicesAfterSortingArray(new int[] {1, 2, 5, 2, 3}, 2).solution());
    }
}
