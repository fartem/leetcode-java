package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConstructTheRectangleTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 2},
                new ConstructTheRectangle(4).solution()
        );
    }

}
