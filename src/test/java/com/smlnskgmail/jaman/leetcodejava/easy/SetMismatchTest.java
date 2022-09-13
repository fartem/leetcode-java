package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SetMismatchTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 3},
                new SetMismatch(new int[]{1, 2, 2, 4}).solution()
        );
    }

}
