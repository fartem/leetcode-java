package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class FindNUniqueIntegersSumUpToZeroTest {

    @Test
    public void defaultTest() {
        assertEquals(0, Arrays.stream(new FindNUniqueIntegersSumUpToZero(5).solution()).sum());
    }
}
