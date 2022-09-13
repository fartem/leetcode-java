package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DecodeXORedArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{1, 0, 2, 1},
                new DecodeXORedArray(new int[]{1, 2, 3}, 1).solution()
        );
    }

}
