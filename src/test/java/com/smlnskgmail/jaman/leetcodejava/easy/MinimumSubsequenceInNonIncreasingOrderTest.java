package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class MinimumSubsequenceInNonIncreasingOrderTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(10, 9),
                new MinimumSubsequenceInNonIncreasingOrder(new int[] {4, 3, 10, 9, 8}).solution());
    }
}
