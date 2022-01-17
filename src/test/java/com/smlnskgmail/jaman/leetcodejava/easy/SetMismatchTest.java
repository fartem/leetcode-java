package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SetMismatchTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(new int[] {2, 3}, new SetMismatch(new int[] {1, 2, 2, 4}).solution());
    }
}
