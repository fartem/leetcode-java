package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindNUniqueIntegersSumUpToZeroTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                Arrays.stream(new FindNUniqueIntegersSumUpToZero(5).solution()).sum()
        );
    }

}
