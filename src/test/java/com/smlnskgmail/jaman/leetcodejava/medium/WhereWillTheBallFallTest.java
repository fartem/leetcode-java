package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class WhereWillTheBallFallTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{1, -1, -1, -1, -1},
                new WhereWillTheBallFall(
                        new int[][]{
                                {1, 1, 1, -1, -1},
                                {1, 1, 1, -1, -1},
                                {-1, -1, -1, 1, 1},
                                {1, 1, 1, 1, -1},
                                {-1, -1, -1, -1, -1}
                        }
                ).solution()
        );
    }

}
