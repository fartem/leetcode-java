package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class MinimumAbsoluteDifferenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 3), Arrays.asList(3, 4)),
                new MinimumAbsoluteDifference(new int[] {4, 2, 1, 3}).solution());
    }
}
