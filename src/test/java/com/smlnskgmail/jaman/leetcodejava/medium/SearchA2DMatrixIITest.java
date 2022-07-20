package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SearchA2DMatrixIITest {

    @Test
    public void defaultTest() {
        assertTrue(
                new SearchA2DMatrixII(
                        new int[][]{
                                {1, 4, 7, 11, 15},
                                {2, 5, 8, 12, 19},
                                {3, 6, 9, 16, 22},
                                {10, 13, 14, 17, 24},
                                {18, 21, 23, 26, 30}
                        },
                        5
                ).solution()
        );
    }

}
