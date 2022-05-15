package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateImageTest {

    @Test
    public void defaultTest() {
        var input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new RotateImage(input).solution();
        assertArrayEquals(
                new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}},
                input
        );
    }

}
